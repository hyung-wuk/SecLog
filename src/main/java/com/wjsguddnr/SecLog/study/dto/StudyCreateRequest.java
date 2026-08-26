package com.wjsguddnr.SecLog.study.dto;

import com.wjsguddnr.SecLog.study.domain.Category;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

import java.time.LocalDate;

@Getter
public class StudyCreateRequest {
    @NotBlank
    private String title;

    @NotBlank
    private String content;

    @NotNull
    private Category category;

    @NotNull
    private LocalDate studyDate;

    @NotNull
    @Min(1)
    private Integer studyMinutes;
}
