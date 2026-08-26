package com.wjsguddnr.SecLog.study.dto;

import com.wjsguddnr.SecLog.study.domain.Category;
import jakarta.validation.constraints.Min;
import lombok.Getter;

import java.time.LocalDate;

@Getter
public class StudyPatchRequest {
    private String title;

    private String content;

    private Category category;

    private LocalDate studyDate;

    @Min(1)
    private Integer studyMinutes;
}
