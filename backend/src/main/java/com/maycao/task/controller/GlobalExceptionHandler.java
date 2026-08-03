package com.maycao.task.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import com.maycao.task.domain.dto.ErrorDto;
import java.util.UUID;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorDto> handleValidationExceptions(MethodArgumentNotValidException ex) {

    String errorMessage = ex.getBindingResult().getFieldErrors().stream()
      .findFirst()
      .map(DefaultMessageSourceResolvable::getDefaultMessage)
      .orElse("Validation Failed.");

    ErrorDto errorDto = new ErrorDto(errorMessage);
    return new ResponseEntity<>(errorDto, HttpStatus.BAD_REQUEST);
  }
}