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

    public void put(
            String title, String content,
            Category category, LocalDate studyDate,
            Integer studyMinutes
    ){
        this.title = title;
        this.content = content;
        this.category = category;
        this.studyDate = studyDate;
        this.studyMinutes = studyMinutes;
    }

    public void patch(
            String title, String content,
            Category category, LocalDate studyDate,
            Integer studyMinutes
    ){
        if (this.title != null) {
            this.title = title;
        }
        if (this.content != null) {
            this.content = content;
        }
        if (this.category != null) {
            this.category = category;
        }
        if (this.studyDate != null) {
            this.studyDate = studyDate;
        }
        if (this.studyMinutes != null) {
            this.studyMinutes = studyMinutes;
        }
    } //Service에 엔티티에 대한 setter 메서드를 생성하는것보다, 엔티티에 업데이트 메서드를 정의해 놓는것이 더 안전
}
