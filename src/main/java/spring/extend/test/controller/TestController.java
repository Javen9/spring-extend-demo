package spring.extend.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by javen on 2017/8/10.
 */
@Controller
@RequestMapping("/test")
public class TestController {

    public TestController() {
        System.out.println("TestController");
    }

    @ResponseBody
    @RequestMapping("/getValue")
    public String getValue() {
        return "getValue";
    }
}
