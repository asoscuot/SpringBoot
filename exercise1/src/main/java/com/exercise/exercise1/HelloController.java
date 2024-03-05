package com.exercise.exercise1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 梁松涛
 * @version 1.0
 **/
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "你好 Spring boot！！！";
    }
}
