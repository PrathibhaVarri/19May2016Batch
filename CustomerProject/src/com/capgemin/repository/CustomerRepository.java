package com.capgemin.repository;

import java.util.List;

import com.capgemin.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}