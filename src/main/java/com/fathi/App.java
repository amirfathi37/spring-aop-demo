package com.fathi;


import com.fathi.config.SpringConfig;
import com.fathi.model.Apple;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {


    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Apple apple = (Apple) context.getBean("apple");
        int answer = apple.call();
    }
}

