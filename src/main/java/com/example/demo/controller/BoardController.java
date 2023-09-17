package com.example.demo.controller;

import com.example.demo.dto.BoardDto;
import com.example.demo.dto.FruitDto;
import com.example.demo.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class BoardController {
    @Autowired
    BoardService boardService;
    @GetMapping("board")
    public List<BoardDto> getBoard(){
        return boardService.getBoard();
    }
    @GetMapping("/board/{id}")
    public BoardDto getBoardInfo(@PathVariable long id){
        return boardService.getBoardInfo(id);
    }
    @DeleteMapping("board/{id}")
    public String delBoardInfo(@PathVariable long id){
       boardService.delBoardInfo(id);
       return  "success";
    }
    @PutMapping("board")
    public String upBoardInfo(@RequestBody BoardDto boardDto){
        boardService.upBoardInfo(boardDto);
        return "success";
    }
    @PostMapping("board")
    public String postBoard(@RequestBody BoardDto boardDto){
       boardService.postBoard(boardDto);
       return "success";
    }
    @PostMapping("test")
    public BoardDto test(@RequestBody BoardDto boardDto){
        return boardDto;
    }
    @GetMapping("test2")
    public String test2(@RequestParam String test){
        return test;
    }
    @GetMapping("test3")
    public Map<String,String> test3(@RequestParam String frait, @RequestParam  String color){
        HashMap map = new HashMap<String,String>();
        map.put("fruit",frait);
        map.put("color",color);
        return map; //GetMapping은 Param
    }
    @PostMapping("test4")
    public List<FruitDto> test4(@RequestBody List<FruitDto> fruitDto){

        return fruitDto; //PostMapping은 body
    }
}
