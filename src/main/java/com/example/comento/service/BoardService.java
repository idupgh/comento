package com.example.comento.service;

import com.example.comento.domain.Board;
import com.example.comento.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

    public void register(Board board) {
        boardRepository.save(board);
    }

    public List<Board> list() {
        return boardRepository.findAll(Sort.by(Sort.Direction.DESC, "idx"));
    }

    public Board detail(int idx) {
        return boardRepository.findById(idx).orElse(null);
    }

    public void update(Board board) {
        boardRepository.save(board);
    }

    public void delete(int idx) {
        boardRepository.deleteById(idx);
    }
}
