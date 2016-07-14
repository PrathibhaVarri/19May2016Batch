package com.capgemin.repository;

import java.util.ArrayList;
import java.util.List;

import com.capgemin.model.Customer;

public class CustomerRepositoryImpl implements CustomerRepository {
	
	List<Customer> customers=new ArrayList();
	/* (non-Javadoc)
	 * @see com.capgemin.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll()
	{
		Customer customer=new Customer();
		customer.setFirstName("Parag");
		customer.setLastName("Goyal");
		
		customers.add(customer);
		
		return customers;
		
	}

}
