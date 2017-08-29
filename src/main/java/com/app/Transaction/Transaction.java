package com.app.Transaction;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.app.Account.Account;

@Entity
@Table(name="Transaction")
public class Transaction {
	
	@Id
	@Column(name="tx_id")
	@GeneratedValue
	private long tx_id;
	private Account accound_id;
	private Account balance;
	private Account description;
	private double amount;
	
	
	public long getTx_id() {
		return tx_id;
	}
	public void setTx_id(long tx_id) {
		this.tx_id = tx_id;
	}
	public Account getAccound_id() {
		return accound_id;
	}
	public void setAccound_id(Account accound_id) {
		this.accound_id = accound_id;
	}
	public Account getBalance() {
		return balance;
	}
	public void setBalance(Account balance) {
		this.balance = balance;
	}
	public Account getDescription() {
		return description;
	}
	public void setDescription(Account description) {
		this.description = description;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
}