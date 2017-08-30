package com.app.Model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

@Entity
@Table(name="test333")
public class Transaction implements Serializable{
	
	@Id
	private long tx_id;
	//@ManyToOne(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	//@JoinColumn(name="accound_id")
	@Column
	private Account accound_id;
	@Column
	private Account balance;
	@Column
	private Account description;
	@Column
	private double amount;
	
	
	
	public long getTx_id() {
		return tx_id;
	}
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
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
	
	public Transaction(long tx_id, Account accound_id, Account balance, Account description, double amount) {
		super();
		this.tx_id = tx_id;
		this.accound_id = accound_id;
		this.balance = balance;
		this.description = description;
		this.amount = amount;
	}
}
