package com.wjsguddnr.SecLog.study.controller;

import com.wjsguddnr.SecLog.study.dto.StudyCreateRequest;
import com.wjsguddnr.SecLog.study.dto.StudyResponse;
import com.wjsguddnr.SecLog.study.service.StudyService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/studies")
public class StudyController {

    private final StudyService studyService;
    public StudyController(StudyService studyService) {
        this.studyService = studyService;
    }

    @PostMapping
    public ResponseEntity<Void> createStudy(@Valid @RequestBody StudyCreateRequest request) {
        studyService.createStudy(request);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    public ResponseEntity<List<StudyResponse>> getAllStudies() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(studyService.findAllStudy());
    }

    @GetMapping (value = "/{id}")
    public ResponseEntity<StudyResponse> getStudyById(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(studyService.findStudyById(id));
    }
}
