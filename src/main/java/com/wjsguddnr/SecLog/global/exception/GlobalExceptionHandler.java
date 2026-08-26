package com.wjsguddnr.SecLog.global.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice //컨트롤러에서 발생하는 모든 예외들을 이 핸들러에서 처리하겠다는 뜻의 어노테이션
public class GlobalExceptionHandler {

    @ExceptionHandler(StudyNotFoundException.class) //내가 만든 예외
    public ResponseEntity<ErrorResponse> handleStudyNotFound(
            StudyNotFoundException e
    ) {
        ErrorResponse response = new ErrorResponse(
                HttpStatus.NOT_FOUND.value(),
                HttpStatus.NOT_FOUND.getReasonPhrase(),
                e.getMessage()
        );

        return ResponseEntity
                .status(response.getStatus())
                .body(response);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class) //자바에 원래 있는 예외
    public ResponseEntity<ErrorResponse> handleException(
            MethodArgumentNotValidException e
    ) {
        ErrorResponse response = new ErrorResponse(
                HttpStatus.BAD_REQUEST.value(),
                HttpStatus.BAD_REQUEST.getReasonPhrase(),
                e.getMessage()
        );
        return ResponseEntity
                .status(response.getStatus())
                .body(response);
    }
}
