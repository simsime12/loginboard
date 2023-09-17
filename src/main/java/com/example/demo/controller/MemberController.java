package com.example.demo.controller;

import com.example.demo.dto.BoardDto;
import com.example.demo.dto.FruitDto;
import com.example.demo.dto.UserDto;
import com.example.demo.service.MemberService;
import org.apache.ibatis.javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

import java.util.Map;
@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class MemberController {
    @Autowired
    MemberService memberService;

    @PostMapping("signup")
    public String postMember(@RequestBody UserDto userDto){
        memberService.postMember(userDto);
        return "success";
    }
    @PostMapping("signing")
    public ResponseEntity<?> signin(@RequestBody UserDto userDto) throws NotFoundException {
        return memberService.signin(userDto);
    }


//    public int sum(int a,int b){
//        return a+b;
//    }
//
//    public String aa(String bb){
//        return "안녕하세요";
//    }
}
