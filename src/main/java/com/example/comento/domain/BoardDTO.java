package com.example.comento.domain;

import lombok.*;

import java.time.LocalDateTime;

@Data
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class BoardDTO {
    private Long bno; // no? seq?
    private String title;
    private String content;

    private Long writerSeq;
    private String writerId;
    private String writerName;
    private String writerEmail;

    private LocalDateTime regDate;
    private LocalDateTime modDate;

    private String category;
}