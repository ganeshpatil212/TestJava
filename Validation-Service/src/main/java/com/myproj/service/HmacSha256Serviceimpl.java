package com.myproj.service;

import java.util.Base64;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.springframework.stereotype.Service;

@Service
public class HmacSha256Serviceimpl implements IHmacSha256Service {


	@Override
	public String generateHmacSha256(String data)  {		
	try {
		Mac mac = Mac.getInstance("HmacSHA256");
        String secret = "your";
		SecretKeySpec secretKey = new SecretKeySpec(secret.getBytes("UTF-8"), "HmacSHA256");
        mac.init(secretKey);

        byte[] hmacBytes = mac.doFinal(data.getBytes("UTF-8"));
        String hamc= Base64.getEncoder().encodeToString(hmacBytes);
		return hamc;
	} catch (Exception e) {
		e.printStackTrace();
	}
		return null;
	}

	@Override
	public boolean validateHmacSha256(String data,  String receivedHmac) {
		
			String generatedHmac = generateHmacSha256(data);
			System.out.println("Received HMAC: " + receivedHmac);
			System.out.println("Generated HMAC: " + generatedHmac);
			
			if(generatedHmac.equals(receivedHmac) && receivedHmac!=null) {
				System.out.println("HMAC is valid.");
				return true;
			} 	
		return false;
	}

}
