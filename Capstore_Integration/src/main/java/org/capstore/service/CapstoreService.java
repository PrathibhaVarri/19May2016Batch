package org.capstore.service;


import java.util.List;

import org.capstore.model.Admin;
import org.capstore.model.Category;
import org.capstore.model.Customer;
import org.capstore.model.Discount;
import org.capstore.model.Merchant;
import org.capstore.model.Product;


public interface CapstoreService {
	
	public List<Category> getAllCategories();
	public List<Product> getProductDetails();

	public List<Product> getProductIdDetails(int productId);
	public void saveCustomer(Customer customer);
	public void saveMerchant(Merchant merchant);
	public void saveCategory(Category category);
	
	public List<Admin> getAllAdmins();
	public List<Merchant> getAllMerchants();
	public List<Customer> getAllCustomers();
	
	public boolean saveAdmin(Admin admin);
	public boolean updatePassword(Admin admin1);
	public List<Product> getProductDetails1();
	public List<Product> getProductDetails2();
	public List<Product> getProductDetails3();
	public List<Product> getProductDetails4();
	public List<Product> getProductDetails5();
	
	public boolean login(Admin admin);
	public boolean merchantlogin(Merchant merchant);
	public boolean customerlogin(Customer customer);

	public List<Product> getSorted();
	public List<Product> getSorted1();
	public void saveDiscount(Discount d);
}
