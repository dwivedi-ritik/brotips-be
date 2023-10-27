package com.xstreet.brotips.models;
import jakarta.validation.constraints.*;
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
    @NotNull
    @Max(64)
    private String boardName;
    @Max(400)
    private String boardDescription;
    @Max(120)
    private String boardShortDescription;
    @NotNull
    private Boolean isNfsw;
//    public Board(String boardName , String boardDescription , String boardShortDescription, Boolean isNfsw){
//        this.boardName = boardName;
//        this.boardDescription = boardDescription;
//        this.boardShortDescription = boardShortDescription;
//        this.isNfsw = isNfsw;
//    }

}
