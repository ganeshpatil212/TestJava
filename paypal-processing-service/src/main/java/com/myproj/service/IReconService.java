package com.myproj.service;

import java.util.List;

import com.myproj.entity.TransactionEntity;

public interface IReconService {
	
	List<TransactionEntity> reconsilePayments();

}
