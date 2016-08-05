package org.capstore.dao;

import java.util.List;

import org.capstore.model.Admin;
import org.capstore.model.Category;
import org.capstore.model.Customer;
import org.capstore.model.Discount;
import org.capstore.model.Merchant;
import org.capstore.model.Product;



public interface CapstoreDao {
	public List<Category> getAllCategories();
	public List<Product> getProductDetails();

	public List<Product> getProductIdDetails(int productId);
	
	public List<Customer> getAllCustomer();
	public void saveCustomer(Customer customer);
	public void saveMerchant(Merchant merchant);
	public void saveCategory(Category category);
	public List<Admin> getAllAdmins();
	public List<Merchant> getAllMerchants();
	
	public boolean saveAdmin(Admin admin);
	
	public void updatePassword(Admin admin1);
	public List<Product> getProductDetails1();
	public List<Product> getProductDetails2();
	public List<Product> getProductDetails3();
	public List<Product> getProductDetails4();
	public List<Product> getProductDetails5();

	public List<Product> getSorted();
	public List<Product> getSorted1();
	public void saveDiscount(Discount d);
}
