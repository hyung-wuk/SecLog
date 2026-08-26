package com.wjsguddnr.SecLog.study.dto;

import com.wjsguddnr.SecLog.study.domain.Category;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class StudyResponse {
    private Long id;

    private String title;

    private String content;

    private Category category;

    private LocalDate studyDate;

    private Integer studyMinutes;
}
