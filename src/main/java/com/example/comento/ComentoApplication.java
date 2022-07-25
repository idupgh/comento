package com.example.comento;

import com.example.comento.domain.Board;
import com.example.comento.repository.BoardRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.util.stream.IntStream;

@SpringBootApplication
public class ComentoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComentoApplication.class, args);
    }
}
