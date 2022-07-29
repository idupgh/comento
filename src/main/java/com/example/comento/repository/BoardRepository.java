package com.example.comento.repository;

import com.example.comento.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Long> {
    // JpaRepository 에는 Entity 클래스와 PK 타입 명시
}
