package com.example.comento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing //Time Entity 에 있는 날짜 자동 입력 활성화
@SpringBootApplication
public class ComentoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComentoApplication.class, args);
    }
}
