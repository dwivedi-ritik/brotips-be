package com.xstreet.brotips.models;
import jakarta.validation.constraints.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

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
    @Size(min = 2 , max = 64,  message = "boardName size must be between 2 to 64")
    private String boardName;
    @Size(min = 2 , max = 240 , message = "boardShortDescription length must be between 2 to 240")
    private String boardShortDescription;
    @Size(min = 8 , max=600, message = "boardDescription length must be between 8 to 600")
    private String boardDescription;
    @NotNull(message = "isNsfw can't be null")
    private Boolean isNsfw;

}
