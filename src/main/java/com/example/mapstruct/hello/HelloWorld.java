package com.example.mapstruct.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: mapstruct
 * @description:
 * @author: chen.zheng
 * @create: 2020/12/7  10:35
 **/
@RestController
public class HelloWorld {

    @RequestMapping("/world")
    public String hello(){

        return "Hello World";
    }

}
