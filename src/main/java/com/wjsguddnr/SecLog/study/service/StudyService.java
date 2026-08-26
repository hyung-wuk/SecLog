package com.wjsguddnr.SecLog.study.service;

import com.wjsguddnr.SecLog.study.domain.Category;
import com.wjsguddnr.SecLog.study.domain.Study;
import com.wjsguddnr.SecLog.study.dto.StudyCreateRequest;
import com.wjsguddnr.SecLog.study.dto.StudyResponse;
import com.wjsguddnr.SecLog.study.repository.StudyRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    public List<StudyResponse> findAllStudy(){ //전체조회
        List<Study> studies = studyRepository.findAll(); //JpaRepository의 전체조회 메소드, List(entity 데이터타입) 으로 반환
        List<StudyResponse> responses = new ArrayList<>(); //전체조회를 위해 response dto형태를 담을 리스트 생성

        for (Study study : studies) {//findAll로 반환 받은 리스트의 Study객체들을 하나하나 꺼내서
            StudyResponse response = new StudyResponse(
                    study.getId(), study.getTitle(),
                    study.getContent(), study.getCategory(),
                    study.getStudyDate(), study.getStudyMinutes()
            ); //StudyResponse 객체를 생성
            responses.add(response); //생성된 StudyResponse 객체들을 리스트에 담음
        }

        return responses; //리스트를 반환
    }

    public StudyResponse findStudyById(Long id) { //단건 조회
        Study study = studyRepository.findById(id).orElseThrow(); //.findById(id).orElseThrow() : 값이 있으면 그 값을 꺼내고, 없으면 예외를 던져라
        // -> newStudyNotFoundException(id) 필요
        StudyResponse response = new StudyResponse(
                study.getId(), study.getTitle(),
                study.getContent(), study.getCategory(),
                study.getStudyDate(), study.getStudyMinutes()
        );
        return response;
    }
}
