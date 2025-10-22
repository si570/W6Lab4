package com.example.w6lab4.controller.errorHandling;

import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandling {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ExceptionDetails showErrorDetail(MethodArgumentNotValidException mae)
    {
        for(FieldError fieldError : mae.getBindingResult().getFieldErrors()) {
            ExceptionDetails exceptionDetails = new ExceptionDetails();
            exceptionDetails.setFeildName(mae.getBindingResult().getFieldError().getField());
            exceptionDetails.setFeildValue(mae.getBindingResult().getFieldError().getDefaultMessage());
        }
        return exceptionDetails;
    }
}
