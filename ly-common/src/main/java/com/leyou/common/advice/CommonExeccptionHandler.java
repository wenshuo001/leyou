package com.leyou.common.advice;

import com.leyou.common.exception.LyException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CommonExeccptionHandler {

    @ExceptionHandler(LyException.class)
    public ResponseEntity<String> handleException(LyException ex){

        ex.getExce
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
    }
}
