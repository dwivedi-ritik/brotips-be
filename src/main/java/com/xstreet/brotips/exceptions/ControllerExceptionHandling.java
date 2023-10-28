package com.xstreet.brotips.exceptions;

import com.xstreet.brotips.entity.InvalidBody;
import jakarta.validation.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.*;

@ControllerAdvice
public class ControllerExceptionHandling extends ResponseEntityExceptionHandler {
    @ExceptionHandler(ConstraintViolationException.class)
    private ResponseEntity<InvalidBody> invalidBodyExceptionHandling(ConstraintViolationException e , WebRequest req){
        List<String> failedConstraints = new ArrayList<>();
        for(var errors : e.getConstraintViolations()){
            failedConstraints.add(errors.getMessage());
        }
        return new ResponseEntity<InvalidBody>(new InvalidBody(failedConstraints , HttpStatus.BAD_REQUEST.value()) , HttpStatus.BAD_REQUEST );
    }
}
