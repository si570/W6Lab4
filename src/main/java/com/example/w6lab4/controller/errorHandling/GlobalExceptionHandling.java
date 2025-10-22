package com.example.w6lab4.controller.errorHandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class GlobalExceptionHandling {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<List<ExceptionDetails>> showErrorDetail(MethodArgumentNotValidException mae)
    {
        List<ExceptionDetails> errorList = new ArrayList<>();
        for(FieldError fieldError : mae.getBindingResult().getFieldErrors()) {
            ExceptionDetails exceptionDetails = new ExceptionDetails();
            exceptionDetails.setFeildName(fieldError.getField());
            exceptionDetails.setFeildValue(fieldError.getDefaultMessage());
            errorList.add(exceptionDetails);
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorList);
    }
}
