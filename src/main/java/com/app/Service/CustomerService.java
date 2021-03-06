package com.app.Service;

import java.util.List;

import com.app.Model.Account;

public interface CustomerService {
	
	public void addAccount(Account account);

	public void deleteAccount(Account account);

	public void updateAccount(Account account);

	public List<Account> getAccounts();

	public Account findStudent(Account account);
	

}
