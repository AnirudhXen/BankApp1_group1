package com.app.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.Model.Account;
import com.app.Model.Customer;

@Repository
@Transactional
public class CustomerDaoImpl implements CustomerDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public void addAccount(Account account) {
		hibernateTemplate.save(account);
		System.out.println("Account added");
		
	}

	public void deleteAccount(Account account) {
		hibernateTemplate.delete(account);
		System.out.println("Account Deleted");
		
	}

	public void updateAccount(Account account) {
		hibernateTemplate.update(account);
		System.out.println("Account Updated");
		
	}

	public List<Account> getAccounts() {
		List<Account> al= new ArrayList<Account>();
		 al=hibernateTemplate.loadAll(Account.class);
		return al;
	}

	public Account findAccount(Long account_Id) {
		 Account acc=(Account)hibernateTemplate.get(Account.class,account_Id);
		return acc;
	}
	
}
