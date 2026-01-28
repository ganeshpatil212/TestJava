package com.myproj.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.myproj.entity.TransactionEntity;
import com.myproj.repository.TransactionRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ReconSerivceImpl implements IReconService {

	private ReconAsynkSerivce reconAsynkSerivce;
	private TransactionRepository transactionRepository;
	
	
	public ReconSerivceImpl(ReconAsynkSerivce reconAsynkSerivce,TransactionRepository transactionRepository) {
		super();
		this.reconAsynkSerivce = reconAsynkSerivce;
			this.transactionRepository = transactionRepository;
	}
	@Override
	//@Scheduled(cron= "0/10  *  * *  * *")
	public List<TransactionEntity> reconsilePayments() {
		log.info("Scheduler running every minute at second 1: " + LocalDateTime.now());
		// TODO Auto-generated method stub
		List<TransactionEntity> k =transactionRepository.getPendingTransactions(2);
		//System.out.println("Pending Transactions: " + k);
		k.forEach(t -> 
				{
					reconAsynkSerivce.reconsilePaymentsAsync(k.stream().toList().get(0));
				log.info("Pending Transaction: " + t) ;
				});
		return k;
	}
	
	
//    @Scheduled(fixedRate = 10000)
//    public void runEvery10Seconds() {
//        System.out.println("Scheduler running every 10 seconds: " + LocalDateTime.now());
//    }

}
