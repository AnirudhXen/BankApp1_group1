package com.app.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Service;

import com.app.Dao.CustomerDao;
import com.app.Model.Account;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	private CustomerDao customerDao;

	public void addAccount(Account account) {
		
		
	}

	public void deleteAccount(Account account) {
		
		
	}

	public void updateAccount(Account account) {
		
	}

	public List<Account> getAccounts() {
		
		return null;
	}

	public Account findStudent(Account account) {
		
		return null;
	}

}
