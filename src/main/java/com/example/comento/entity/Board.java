package com.example.comento.entity;

import lombok.*;
import org.springframework.util.Assert;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
// access 는  생성자의 접근 권한을 설정하는 속성 > protected 인 이유는 Entity 생성을 외부에서 할 필요가 없기 때문.
@Getter
@Entity // Entity 클래스는 JPA 가 관리
@Table(name = "board")
public class Board extends Time {

    @Id // 테이블의 기본키
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(length = 10, nullable = false)
    private String writer;

    @Column(length = 100, nullable = false)
    private String title;

    @Column
    private String content;

    @Builder
    public Board(Long id, String title, String content, String writer) {
        this.id = id;
        this.writer = writer;
        this.title = title;
        this.content = content;
    }
}
