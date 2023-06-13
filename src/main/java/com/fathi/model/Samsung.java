package com.fathi.model;


import org.springframework.stereotype.Component;

@Component
public class Samsung implements Mobile {
    public void call() {
        System.out.println("It is calling ...");
    }
}
