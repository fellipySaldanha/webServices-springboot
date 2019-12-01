package com.fellipy.course.resources.exceptions;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import com.fellipy.course.services.exceptions.DatabaseException;
import com.fellipy.course.services.exceptions.ResourceNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;



@ControllerAdvice 
public class ResourceExceptionHandler {
    
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException error, HttpServletRequest request){
        String errorMsg = "Resource not found";
        HttpStatus status = HttpStatus.NOT_FOUND;
        StandardError standardError = new StandardError(Instant.now(), status.value(), errorMsg, error.getMessage(), request.getRequestURI());
        return ResponseEntity.status(status).body(standardError);
    }

    @ExceptionHandler(DatabaseException.class)
    public ResponseEntity<StandardError> database(DatabaseException error, HttpServletRequest request){
        String errorMsg = "Database error";
        HttpStatus status = HttpStatus.BAD_REQUEST;
        StandardError standardError = new StandardError(Instant.now(), status.value(), errorMsg, error.getMessage(), request.getRequestURI());
        return ResponseEntity.status(status).body(standardError);
    }
    
}