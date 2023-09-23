package com.xstreet.brotips.service;

import com.xstreet.brotips.models.Board;
import com.xstreet.brotips.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BoardService {
    @Autowired
    private BoardRepository boardRepository;
    /*
        Configure all the boards for Post creation
     */
    public Boolean saveBoardList(List<Board> boards){
        boardRepository.saveAll(boards);
        return true;
    }
}