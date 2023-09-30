package by.vvv.euricaclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class Controller {
    @GetMapping("/test")
    public String getText(){
        return "Hello from API-Gateway!";
    }
}
