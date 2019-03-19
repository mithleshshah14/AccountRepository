package com.wipro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.model.Transactions;
import com.wipro.model.Entity.BalanceEntity;
import com.wipro.model.Entity.TransactionEntity;
import com.wipro.model.convertor.TransactionEntityConvertor;
import com.wipro.repository.BalanceRepository;
import com.wipro.repository.TransactionRepository;
@Service
public class TransactionService {

	@Autowired
	private TransactionRepository transactionRepository;
	@Autowired
	private BalanceRepository balanceRepository;
	@Autowired
	private TransactionEntityConvertor convertor;
	
	public Transactions getTransaction(String id) {
		BalanceEntity balanceEntity= new BalanceEntity();
		balanceEntity=balanceRepository.findByAccountEntityId(id);
		TransactionEntity transactionEntity =transactionRepository.findByAccountEntityId(id); 
		return convertor.transactionConvertor(transactionEntity, id, balanceEntity);
	}
}
