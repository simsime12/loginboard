package com.example.demo.service;

import com.example.demo.config.UserSha256;
import com.example.demo.dto.BoardDto;
import com.example.demo.dto.UserDto;
import com.example.demo.mapper.UserMapper;
import org.apache.ibatis.javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import static com.example.demo.config.UserSha256.encrypt;

@Service
public class MemberService {
    @Autowired
    UserMapper userMapper;

    public void postMember(UserDto userDto) {
        userDto.setPassword(encrypt(userDto.getPassword()));
        userMapper.postMember(userDto);

    }

    public void postuser(UserDto userDto) {
        userMapper.postUser(userDto);
    }

    public ResponseEntity<?> signin(UserDto userDto) throws NotFoundException {


        UserDto userDto1 = userMapper.getUserOne(userDto);

        if(userDto1==null){
            throw new NotFoundException("찾을수 없습니다");
        }

        String encryptPwd = encrypt(userDto.getPassword());
        String encryptedPwd = userDto1.getPassword();
        if(encryptPwd.equals(encryptedPwd)){
            return ResponseEntity.ok("로그인 성공");
        }else{
            return ResponseEntity.ok("로그인 실패");
        }
    }

    public void test(){
        int a =3;
        int b= 4;
        int c =6;
        int d = sum(a,b,c);
    }
    public void test2(){
        int a =3;
        int b= 4;
        int c =6;
        int d = sum(a,b,c);
    }
    public int sum(int a,int b,int c){
        return a+b+c;
    }
}
