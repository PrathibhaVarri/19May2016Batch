package com.capgemini.service;

import java.util.List;

import com.capgemin.model.Customer;
import com.capgemin.repository.CustomerRepository;
import com.capgemin.repository.CustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {
	CustomerRepository customerRepository=new CustomerRepositoryImpl();
	/* (non-Javadoc)
	 * @see com.capgemini.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll()
	{
		return customerRepository.findAll();
	}

}
