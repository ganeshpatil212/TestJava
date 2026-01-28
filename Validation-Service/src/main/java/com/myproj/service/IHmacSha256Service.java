package com.myproj.service;

import org.springframework.stereotype.Service;

@Service
public interface IHmacSha256Service { 
	
	String generateHmacSha256(String data)throws Exception;
	boolean validateHmacSha256(String data, String hmacToValidate);
}
