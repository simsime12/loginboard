package com.example.demo.controller;

import com.example.demo.Calculate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private Calculate calculate;

    @GetMapping("/sum")
    public int getSum(@RequestParam int a,@RequestParam int b){
        return calculate.sum(a,b);

    }
    @GetMapping("/minus")
    public int getminus(@RequestParam int a,@RequestParam int b){
        return calculate.minus(a,b);
    }
    @GetMapping("/multiply")
    public int getmultiply(@RequestParam int a,@RequestParam int b){
//        Calculate calc = new Calculate();
//        return calc.multiply(a,b);
        return calculate.multiply(a,b);
    }
}
