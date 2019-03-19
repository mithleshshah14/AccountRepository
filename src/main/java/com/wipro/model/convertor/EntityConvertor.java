package com.wipro.model.convertor;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.wipro.model.Account;
import com.wipro.model.Balance;
import com.wipro.model.Entity.AccountEntity;
import com.wipro.model.Entity.BalanceEntity;
@Service
public class EntityConvertor {

	
	public Account AccountConvertor(AccountEntity accountEntity) {
		Account account=new Account();
		account.setId(accountEntity.getId());
		account.setName(accountEntity.getName());
		account.setBank(accountEntity.getBank());
		return account;
	}
	
	public List<Account> AccountConvertor(List<AccountEntity> accountEntitys) {
		List<Account> accounts=new ArrayList<>();
		for(AccountEntity entity:accountEntitys) {
			accounts.add(AccountConvertor(entity));
		}
		return accounts;
	}
}
