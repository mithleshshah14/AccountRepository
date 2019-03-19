package com.wipro.model;

import org.springframework.beans.factory.annotation.Autowired;

import com.wipro.model.convertor.EntityConvertor;

public class Balance {
	
	private String id;
	
	double balance;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}
