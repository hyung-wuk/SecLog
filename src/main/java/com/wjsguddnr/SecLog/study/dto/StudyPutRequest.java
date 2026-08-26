package com.wjsguddnr.SecLog.study.dto;

import lombok.Getter;
import com.wjsguddnr.SecLog.study.domain.Category;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

@Getter
public class StudyPutRequest {
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
