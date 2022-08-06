package com.example.comento.domain;

import com.example.comento.entity.Board;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;


@FieldDefaults(level = FieldDefaults.PRIVATE)
@Getter
@Setter
@ToString
@NoArgsConstructor
public class BoardDto {
    Long id;
    String writer;
    String title;
    String content;
    LocalDateTime createdDate;
    LocalDateTime modifiedDate;

    public Board toEntity(){
        // DTO 에서 필요한 부분을 빌더패턴을 통해 entity 로 만듦
        Board board = Board.builder()
                .id(id)
                .writer(writer)
                .title(title)
                .content(content)
                .build();
        return board;
    }

    @Builder
    public BoardDto(Long id, String title, String content, String writer, LocalDateTime createdDate, LocalDateTime modifiedDate) {
        this.id = id;
        this.writer = writer;
        this.title = title;
        this.content = content;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
    }
}
