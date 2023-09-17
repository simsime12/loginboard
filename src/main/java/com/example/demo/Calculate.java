package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Calculate {

    public int sum(int a,int b){
        return a+b;
    }
    public int minus(int a,int b){
        return a-b;
    }
    public int multiply(int a,int b){
        return a*b;
    }
}
