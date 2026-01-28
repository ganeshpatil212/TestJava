package com.myproj.exception;

import org.springframework.http.HttpStatus;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class CustomException extends RuntimeException {
	
	    private int  errorCode;
	    private String message;	    
	    private HttpStatus httpStatus;
	  
	    public CustomException(int errorCode, String message,HttpStatus status) {
	        super(message);
	        this.errorCode = errorCode;
	        this.httpStatus = status;
	        this.message=message;
	    }
	
	}
