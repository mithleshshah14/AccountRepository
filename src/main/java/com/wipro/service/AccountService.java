package com.wipro.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.model.Account;
import com.wipro.model.Entity.AccountEntity;
import com.wipro.model.convertor.EntityConvertor;
import com.wipro.repository.AccountRepository;

@Service
public class AccountService {
	
	@Autowired
	private AccountRepository accountRepository;
	@Autowired
	private EntityConvertor convertor;

		public List<Account> getAccount(){
			List<AccountEntity> accountsEntity=new ArrayList<AccountEntity>();
			accountRepository.findAll().forEach(accountsEntity::add);
			return convertor.AccountConvertor(accountsEntity);
		}
		
		public Account getAccountById(String id) {
			return convertor.AccountConvertor(accountRepository.findById(id).get());
		}

		public void addAccount(AccountEntity accountEntity) {
			accountRepository.save(accountEntity);
		}

		public void updateAccount( AccountEntity accountEntity) {
			accountRepository.save(accountEntity);
		}

		public void deleteAccount(String id) {
			
			accountRepository.deleteById(id);
			
		}
}
