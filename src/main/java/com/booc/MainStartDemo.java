package com.booc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MainStartDemo {

    @RequestMapping("/")
    public String home(){
        return "welcom booc,haha";
    }


    public static void main(String[] args){
        SpringApplication.run(MainStartDemo.class, args);
    }
}
