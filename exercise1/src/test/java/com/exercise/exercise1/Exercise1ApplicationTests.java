package com.exercise.exercise1;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)//测试运行器，并加载Spring Boot测试注解
@SpringBootTest//标记单元测试类，并加载项目的上下文环境ApplicationContext
public class Exercise1ApplicationTests {
    public void contextLoads() {

    }

    @Autowired
    private HelloController helloController;

    @Test
    public void helloControllerText(){
        String hello = helloController.hello();
        System.out.println(hello);
    }

}

