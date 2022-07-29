package com.example.comento.entity;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass   // 클래스가 만들어지지 않는 기초 클래스라는 Annotation
@EntityListeners(value = {AuditingEntityListener.class})    // Entity 의 변화를 감지하는 리스너
// JPA 에게 Auditing(날짜, 시간 정보 제공 기능)을 사용한다는 것을 알림

public abstract class Time {  // 상속

    @CreatedDate // 추가하지 않으면 수정시 값이 null 로 들어감 / 생성일 주입하는 어노테이션
    @Column(updatable = false) // 생성일은 update 할 필요 없음
    private LocalDateTime createdDate;

    @LastModifiedDate // 수정일자 주입하는 어노테이션
    private LocalDateTime modifiedDate;
}
