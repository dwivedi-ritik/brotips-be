package com.xstreet.brotips.entity;

import com.xstreet.brotips.models.Board;
import com.xstreet.brotips.models.Post;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@AllArgsConstructor
public class PostEntity {
    private Post post;
    private Board board;

}
