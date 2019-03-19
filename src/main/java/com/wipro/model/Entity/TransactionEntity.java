package com.wipro.model.Entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="transactions")
public class TransactionEntity{

	@ManyToOne
	@JoinColumn(name="account_Id")
	private AccountEntity accountEntity;
	@Id
	private double credit;
	private double debit;
	public AccountEntity getAccountEntity() {
		return accountEntity;
	}
	public void setAccountEntity(AccountEntity accountEntity) {
		this.accountEntity = accountEntity;
	}
	public double getCredit() {
		return credit;
	}
	public void setCredit(double credit) {
		this.credit = credit;
	}
	public double getDebit() {
		return debit;
	}
	public void setDebit(double debit) {
		this.debit = debit;
	}
	
	
}
