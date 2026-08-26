package com.wjsguddnr.SecLog.study.service;

import com.wjsguddnr.SecLog.study.domain.Category;
import com.wjsguddnr.SecLog.study.domain.Study;
import com.wjsguddnr.SecLog.study.dto.StudyCreateRequest;
import com.wjsguddnr.SecLog.study.repository.StudyRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class StudyService {
    private final StudyRepository studyRepository;

    public StudyService(StudyRepository studyRepository) {
        this.studyRepository = studyRepository;
    }

    public void createStudy(StudyCreateRequest request) {
        Study study = new Study(
                request.getTitle(),
                request.getContent(),
                request.getCategory(),
                request.getStudyDate(),
                request.getStudyMinutes()

        );
        studyRepository.save(study);
    }
}
