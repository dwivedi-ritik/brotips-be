package com.xstreet.brotips.confControllers;

import com.xstreet.brotips.models.Board;
import com.xstreet.brotips.service.BoardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/configure")
public class ConfigController {

    @Autowired
    private BoardService boardService;

    private final Logger logger = LoggerFactory.getLogger(ConfigController.class);
    @PutMapping("/boards")
    public ResponseEntity<String> configureBoards(){
        logger.info("POST request at /api/configure/boards");
        List<Board> boards = List.of(
                new Board("FirstBoard" , "Board Description" , "Board Short Description" , false),
                new Board("Health" , "Board Description" , "Board Short Description" , true)
        );
        boardService.saveBoardList(boards);
        return new ResponseEntity<>("Board are configured" , HttpStatus.CREATED);
    }
}
