package com.myproj.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import com.myproj.entity.TransactionEntity;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class ReconAsynkSerivce {

	@Async
	public void reconsilePaymentsAsync(TransactionEntity txn) {
		// TODO Auto-generated method stub
	log.info("Async Recon Service called" + txn.getId());	
	}
}
