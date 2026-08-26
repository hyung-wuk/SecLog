package com.wjsguddnr.SecLog.study.domain;
import jakarta.persistence.*; //JPA관련 어노테이션과 클래스들을 가져옴
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Study {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Category category;

    @Column (nullable = false)
    private LocalDate studyDate;

    @Column(nullable = false)
    private Integer studyMinutes;

    public Study(String title,
          String content,
          Category category,
          LocalDate studyDate,
          Integer studyMinutes) {
        this.title = title;
        this.content = content;
        this.category = category;
        this.studyDate = studyDate;
        this.studyMinutes = studyMinutes;
    }
}
