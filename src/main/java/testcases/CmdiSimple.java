package testcases;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class CmdiSimple {
    @RequestMapping("/cmdi")
    public void test(String cmd) throws IOException {
        Runtime.getRuntime().exec(cmd);
    }
}
