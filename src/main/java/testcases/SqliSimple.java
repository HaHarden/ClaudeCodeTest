package testcases;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.*;

@RestController
public class SqliSimple {
    @RequestMapping("/sqli")
    public void test(String name) throws SQLException {
        String query = "SELECT * FROM users WHERE username = '" + name + "'";
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "username", "password");
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(query);
    }
}
