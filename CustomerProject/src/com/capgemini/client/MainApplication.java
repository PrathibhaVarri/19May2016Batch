package com.capgemini.client;

import com.capgemini.service.CustomerService;
import com.capgemini.service.CustomerServiceImpl;

public class MainApplication {

	public static void main(String[] args) {
		CustomerService customerService = new CustomerServiceImpl();

		System.out.println(customerService.findAll().get(0).getFirstName());
		
	}

}
