package com.wipro.model.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="balance")
public class BalanceEntity {
	
	@OneToOne
	@JoinColumn(name="account_Id")
	private AccountEntity accountEntity;
	@Id
	private double balance;
	public AccountEntity getAccountEntity() {
		return accountEntity;
	}
	public void setAccountEntity(AccountEntity accountEntity) {
		this.accountEntity = accountEntity;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}
