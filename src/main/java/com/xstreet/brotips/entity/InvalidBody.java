package com.xstreet.brotips.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class InvalidBody {
    private List<String> message;
    private Integer code;
}
