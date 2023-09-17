package com.example.demo.service;

import com.example.demo.dto.BoardDto;
import com.example.demo.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {
    @Autowired
    BoardMapper boardMapper;

    public List<BoardDto> getBoard() {

        return boardMapper.getBoard();
    }

    public BoardDto getBoardInfo(long id) {
        return boardMapper.getBoardInfo(id);
    }

    public void postBoard(BoardDto boardDto) {
        boardMapper.postBoard(boardDto);
    }

    public void delBoardInfo(long id) {
        boardMapper.delBoardInfo(id);
    }

    public void upBoardInfo(BoardDto boardDto) {
        boardMapper.upBoardInfo(boardDto);
    }
}
