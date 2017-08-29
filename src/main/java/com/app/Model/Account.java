package com.app.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Account")
public class Account {
	
	@Id
	@Column(name="account_Id")
	@GeneratedValue
	private long account_Id;
	private String actType;
	private String description;
	private double balance;
	private double credit_line;
	private double begin_balance;
	private double begin_balance_timestamp; 
	
	public long getAccount_Id() {
		return account_Id;
	}
	public void setAccount_Id(long account_Id) {
		this.account_Id = account_Id;
	}
	public String getActType() {
		return actType;
	}
	public void setActType(String actType) {
		this.actType = actType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getCredit_line() {
		return credit_line;
	}
	public void setCredit_line(double credit_line) {
		this.credit_line = credit_line;
	}
	public double getBegin_balance() {
		return begin_balance;
	}
	public void setBegin_balance(double begin_balance) {
		this.begin_balance = begin_balance;
	}
	public double getBegin_balance_timestamp() {
		return begin_balance_timestamp;
	}
	public void setBegin_balance_timestamp(double begin_balance_timestamp) {
		this.begin_balance_timestamp = begin_balance_timestamp;
	}
	

}
