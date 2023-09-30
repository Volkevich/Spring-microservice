package by.vvv.euricaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class Controller {
    @Value("${eureka.instance.instance-id}")
    public String id;
    @GetMapping("/test")
    public String getText(){
        return id;
    }
}
