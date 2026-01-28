package com.myproj.service;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.myproj.exception.CustomException;
import com.myproj.exception.ErrorCodeEnum;
import com.myproj.pojo.CreatePaymentResponce;
import com.myproj.pojo.PaymentRequest;

@Service
public class PaymentService {
	
	public CreatePaymentResponce createPayment(PaymentRequest paymentRequest) {
		
		if(!paymentRequest.getPayment().getPaymentMethod().equals("paypal")) {
			throw new CustomException(ErrorCodeEnum.duggu.getErrorCode(),"34535dsdgsd ",HttpStatus.BAD_REQUEST);
		}
	
		System.out.println("Inside PaymentService createPayment");
		CreatePaymentResponce responce=CreatePaymentResponce.builder()
				.txnRef("TXN123456")
				.redirectUrl("http://payment-gateway.com/redirect")
				.providerRef("PROV987654")
				.build();
		return responce;
	}

}
