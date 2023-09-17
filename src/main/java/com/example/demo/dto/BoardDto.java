package com.example.demo.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class BoardDto {

    private long id;
    private String title;
    private String content;
    private long userId;
    private String write_time;


}
