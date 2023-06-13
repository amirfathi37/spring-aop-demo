package com.fathi.model;

import org.springframework.stereotype.Component;

@Component
//cross cutting concern
public class Apple {

    public int call() {
        System.out.println("in apple ...");
        return 22;
    }



}
