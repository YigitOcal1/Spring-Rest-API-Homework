package com.example.CRUDApp;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.ZonedDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;



@ControllerAdvice
public class ErrorHandler {
	

	
@ExceptionHandler(NotFoundException.class)
public ResponseEntity<Object> handleNotFoundException(NotFoundException exception){
					
			Error error=new Error(exception.getMessage(),HttpStatus.NOT_FOUND,ZonedDateTime.now());
			
			return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);		

	}


@ExceptionHandler(Exception.class)

public ResponseEntity<?> handleGlobalExceptionHandling(Exception exception){
	Error error=new Error(exception.getMessage(), HttpStatus.NOT_FOUND,ZonedDateTime.now());
	
	return new ResponseEntity<>(error,HttpStatus.INTERNAL_SERVER_ERROR);


}
}