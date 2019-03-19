package com.wipro.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.model.Account;
import com.wipro.model.Entity.AccountEntity;
import com.wipro.model.convertor.EntityConvertor;
import com.wipro.service.AccountService;

@RestController
public class AccountController {
	@Autowired
	private AccountService accountService;

	@GetMapping("/accounts")
	public List<Account> getAccounts(){
		return accountService.getAccount();
	}
	@GetMapping("/accounts/{id}")
	public Account getAccount(@PathVariable String id) {
		return accountService.getAccountById(id);
	}
	
	@PostMapping("/account")
	public void addAccount(@RequestBody AccountEntity accountEntity) {
		accountService.addAccount(accountEntity);
	}
	
	@PutMapping("/accounts/{id}")
	public void updateAccount(@RequestBody AccountEntity accountEntity) {
		accountService.updateAccount(accountEntity);
	}
	
	@DeleteMapping("/accounts/{id}")
	public void deleteAccount(@PathVariable String id) {
		accountService.deleteAccount(id);
	}
}
