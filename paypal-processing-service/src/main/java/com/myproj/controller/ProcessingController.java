package com.myproj.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myproj.entity.TransactionEntity;
import com.myproj.repository.TransactionRepository;
import com.myproj.service.IReconService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/v1/process")
@Slf4j
public class ProcessingController {

	private IReconService reconService;


	public ProcessingController(IReconService reconService) {
		super();
		this.reconService = reconService;

	}

	@GetMapping("/recon")
	public String  reconsilePayments() {	
		List<TransactionEntity>k=	reconService.reconsilePayments();


		System.out.println("Pending Transactions: " + k);
		return "from recon endpoint" +k ;
	}
	
	@GetMapping("/test")
	public String  test() {
		return "test";
	}
}
