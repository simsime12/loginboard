package com.example.demo.mapper;

import com.example.demo.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {

    void postMember(UserDto userDto);

    String postUser(UserDto userDto);

    UserDto getUserOne(UserDto userDto);
}