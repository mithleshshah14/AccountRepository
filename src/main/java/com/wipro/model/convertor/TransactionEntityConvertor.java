package com.wipro.model.convertor;

import com.wipro.model.Entity.BalanceEntity;

import org.springframework.stereotype.Service;

import com.wipro.model.Transactions;
import com.wipro.model.Entity.TransactionEntity;

@Service
public class TransactionEntityConvertor {

	public Transactions transactionConvertor(TransactionEntity transactionEntity,String id,BalanceEntity balanceEntity) {
		
		Transactions transactions = new Transactions();
		transactions.setAccountId(id);
		transactions.setCredit(transactionEntity.getCredit());
		transactions.setDebit(transactionEntity.getDebit());
		transactions.setBalance(balanceEntity.getBalance());
		return transactions;
	}
}
