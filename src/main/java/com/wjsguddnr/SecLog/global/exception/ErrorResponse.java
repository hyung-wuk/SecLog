package com.wjsguddnr.SecLog.global.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ErrorResponse { //에러 응답에 대한 dto
    private int status;

    private String error;

    private String message;
}
