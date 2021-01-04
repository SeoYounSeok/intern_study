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
// 자바에 persistence
public class Post {
    // pk 니까
    @Id
    // 세팅해줘 자바에서 DB 가기전에 알아서 해주는것

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

    String banner;
}
