package com.wipro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.model.Transactions;
import com.wipro.service.TransactionService;

@RestController
public class TransactionController {

	@Autowired
	private TransactionService service;
	@GetMapping("/account/{id}/transactions")
	Transactions getTransaction(@PathVariable String id) {
		return service.getTransaction(id);
		
	}
}
