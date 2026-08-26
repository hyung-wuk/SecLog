package com.wjsguddnr.SecLog.global.exception;

public class StudyNotFoundException extends RuntimeException {

    public StudyNotFoundException(Long id) {
        super("존재하지 않는 학습 기록. id = " + id);
    }
}
