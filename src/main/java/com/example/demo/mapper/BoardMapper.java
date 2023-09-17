package com.example.demo.mapper;

import com.example.demo.dto.BoardDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BoardMapper {
    List<BoardDto> getBoard();

    BoardDto getBoardInfo(long id);

    void postBoard(BoardDto boardDto);

    void delBoardInfo(long id);

    void upBoardInfo(BoardDto boardDto);
}
