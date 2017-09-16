package spring.extend.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by javen on 2017/8/10.
 */
@RestController
@RequestMapping("/testRest")
public class TestRestController {

    @ResponseBody
    @RequestMapping("/getValue")
    public String getValue() {
        return "getValue";
    }
}
