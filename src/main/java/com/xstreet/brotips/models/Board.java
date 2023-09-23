package com.xstreet.brotips.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "board")
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String boardId;
    private String boardName;
    private String boardDescription;
    private String boardShortDescription;
    private Boolean isNfsw;
}
