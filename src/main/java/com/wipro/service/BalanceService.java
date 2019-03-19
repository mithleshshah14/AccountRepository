package com.wipro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.model.Balance;
import com.wipro.model.Entity.BalanceEntity;
import com.wipro.model.convertor.BalanceEntityConvertor;
import com.wipro.model.convertor.EntityConvertor;
import com.wipro.repository.BalanceRepository;
@Service
public class BalanceService {
	@Autowired
	public BalanceRepository balanceRepository;
	@Autowired
	public BalanceEntityConvertor convertor;
	

	public void addBalance(BalanceEntity balanceEntity) {
		balanceRepository.save(balanceEntity);
	}
	
	  public Balance findByAccountId(String accountId) { 
		  BalanceEntity balanceEntity= balanceRepository.findByAccountEntityId(accountId);
		  
		  return convertor.balanceConvertor(balanceEntity, accountId);
			  
			  
	  }
	 
}
