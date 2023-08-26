package com.project.bookymyshow.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class GlobalExceptionHandler
{
    @ExceptionHandler(Exception.class) // Catch all unexpected exceptions
    public ResponseEntity<String> handleGenericException(Exception ex)
    {
        String errorMessage = "An error occurred while processing your request. Please try again later with correct details.";
        return new ResponseEntity<>(errorMessage, HttpStatus.INTERNAL_SERVER_ERROR);
    }


}