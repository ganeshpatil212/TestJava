package com.myproj.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.myproj.pojo.CreatePaymentResponce;
import com.myproj.pojo.PaymentRequest;
import com.myproj.service.IHmacSha256Service;
import com.myproj.service.PaymentService;

@RestController
@RequestMapping("/v1/payment")
public class PaymentController {

	private Gson gson;
	private IHmacSha256Service hmacSha256Service;
	private PaymentService paymentService;

	public PaymentController(Gson gson, IHmacSha256Service hmacSha256Service, PaymentService paymentService) {
		this.gson = gson;
		this.hmacSha256Service = hmacSha256Service;
		this.paymentService = paymentService;
	}


	@PostMapping()
	public ResponseEntity<CreatePaymentResponce>  createPayment(@RequestBody PaymentRequest paymentRequest)  {

		System.out.println("payment request"+ paymentRequest);
		
		CreatePaymentResponce responceFromPaymentServices=paymentService.createPayment(paymentRequest);

		String json=gson.toJson(paymentRequest);
	//	ResponseEntity<CreatePaymentResponce> enti=  

		return  new ResponseEntity<CreatePaymentResponce>(responceFromPaymentServices,  HttpStatus.CREATED);
	}
	
	@PostMapping("/{txnRef}/capture")
	public String capturePayment(@PathVariable String txnRef) {		
		return "payment captured for txnRef: "+ txnRef;
	}
	
	@GetMapping("/{txnRef}")
	public String getPayment(@PathVariable String txnRef) {		
		return "payment details for txnRef: "+ txnRef;
	}

	@GetMapping("/test")
	public String test() {		
		return "from test";
	}

}
