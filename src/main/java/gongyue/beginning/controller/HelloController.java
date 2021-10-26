package gongyue.beginning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller//运输这个类去接收前端的请求
public class HelloController {

    @GetMapping("/")
    public String hello(){
        return "hello";
    }
}
