package com.xstreet.brotips.controller;

import com.xstreet.brotips.models.Board;
import com.xstreet.brotips.service.BoardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/board")
public class BoardController {
    @Autowired
    private BoardService boardService;
    private final Logger logger =  LoggerFactory.getLogger(BoardController.class);
    @GetMapping
    public ResponseEntity<List<Board>> getAllBoard(){
        logger.info("GET REQUEST AT /api/board");
        return new ResponseEntity<List<Board>>(boardService.getAllBoards() , HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Board> addBoard(@RequestBody Board board){
        logger.info("POST REQUEST AT /api/board/");
        return new ResponseEntity<>(boardService.saveBoard(board) , HttpStatus.CREATED);
    }




}
