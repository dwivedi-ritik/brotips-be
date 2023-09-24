package com.xstreet.brotips.service;

import com.xstreet.brotips.models.Board;
import com.xstreet.brotips.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {
    @Autowired
    private BoardRepository boardRepository;
    /*
        Configure all the boards for Post creation
     */
    public void saveBoardList(List<Board> boards){
        boardRepository.saveAll(boards);
    }

    public List<Board> getAllBoards(){
        return boardRepository.findAll();
    }
}
