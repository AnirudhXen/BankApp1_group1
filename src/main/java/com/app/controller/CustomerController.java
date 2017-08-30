package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.app.Service.CustomerService;
@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	

}
