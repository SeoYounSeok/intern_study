package net.joins.domain.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.UpdateTimestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Post {
    // PK 선언
    @Id
    // 기본키 자동 생성 방법
    // IDENTITY, SEQUENCE, TABLE, AUTO 총 4가지로 구성
    // IDENTITY : 기본 키 생성을 데이터베이스에 위임하는 방법
    // SEQUENCE : 데이터베이스 시퀀스를 사용해서 기본 키를 할당하는 방법
    // TABLE : 키 생성 테이블을 사용하는 법
    // AUTO : 데이터베이스 벤더에 의존하지 않고, 데이터베이스는 기본키를 할당하는 방법
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;

    @Column(length = 50, nullable = false)
    String title;

    @Column(length = 50)
    String subtitle;

    @Column(length = 50)
    String href;

    @UpdateTimestamp
    LocalDateTime updated;

    @Column(columnDefinition = "TEXT")
    String content;

    // 사진을 이용하는 것
    String banner;
}
