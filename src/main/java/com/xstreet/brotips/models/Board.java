package com.xstreet.brotips.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "board")
@Getter
@Setter
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long boardId;
    private String boardName;
    private String boardDescription;
    private String boardShortDescription;
    private Boolean isNfsw;

    public Board(String boardName , String boardDescription , String boardShortDescription, Boolean isNfsw){
        this.boardName = boardName;
        this.boardDescription = boardDescription;
        this.boardShortDescription = boardShortDescription;
        this.isNfsw = isNfsw;
    }

}
