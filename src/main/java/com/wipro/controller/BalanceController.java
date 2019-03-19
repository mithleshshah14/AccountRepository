package com.wipro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.model.Account;
import com.wipro.model.Balance;
import com.wipro.model.Entity.AccountEntity;
import com.wipro.model.Entity.BalanceEntity;
import com.wipro.model.convertor.BalanceEntityConvertor;
import com.wipro.model.convertor.EntityConvertor;
import com.wipro.repository.AccountRepository;
import com.wipro.service.BalanceService;

@RestController
public class BalanceController {
	@Autowired
	private BalanceService balanceService;
	@Autowired
	private AccountRepository accountRepository;

	@GetMapping("/accounts/{id}/balance")
	public Balance getBalance(@PathVariable String id) {
		
		return balanceService.findByAccountId(id);
	}

	@PostMapping("/account/{id}/balance")
	public void addBalance(@RequestBody BalanceEntity balanceEntity, @PathVariable String id) {
		balanceEntity.setAccountEntity(accountRepository.findById(id).get());
		balanceService.addBalance(balanceEntity);
	}

}
