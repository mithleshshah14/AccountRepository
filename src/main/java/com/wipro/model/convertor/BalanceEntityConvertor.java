package com.wipro.model.convertor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.model.Account;
import com.wipro.model.Balance;
import com.wipro.model.Entity.BalanceEntity;
import org.springframework.context.annotation.*;

@Service
public class BalanceEntityConvertor {

	
	
	public static Balance balanceConvertor(BalanceEntity balanceEntity, String id) {
		Balance balance = new Balance();
		balance.setId(id);
		balance.setBalance(balanceEntity.getBalance());
		return balance;
	}
}
