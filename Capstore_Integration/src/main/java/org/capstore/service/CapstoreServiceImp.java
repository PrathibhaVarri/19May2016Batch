package org.capstore.service;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import javax.transaction.Transactional;

import org.capstore.dao.CapstoreDao;
import org.capstore.model.Admin;
import org.capstore.model.Category;
import org.capstore.model.Customer;
import org.capstore.model.Discount;
import org.capstore.model.Merchant;
import org.capstore.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("capstoreService")
@Transactional
public class CapstoreServiceImp implements CapstoreService {
	
	@Autowired
	private CapstoreDao capstoreDao;


	@Override
	public List<Category> getAllCategories() {
		// TODO Auto-generated method stub
		return capstoreDao.getAllCategories();
	}

	@Override
	public List<Product> getProductDetails() {
		// TODO Auto-generated method stub
		return capstoreDao.getProductDetails();
	}

	@Override
	public List<Product> getProductIdDetails(int productId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void saveDiscount(Discount d) {
		capstoreDao.saveDiscount(d);
	}
	
	@Override
	public void saveCustomer(Customer customer){
		capstoreDao.saveCustomer(customer);
	}
	@Override
	public void saveMerchant(Merchant merchant){
		capstoreDao.saveMerchant(merchant);
	}
	

	public void saveCategory(Category category) {
		capstoreDao.saveCategory(category);
		
	}

	@Override
	public List<Admin> getAllAdmins() {
		return capstoreDao.getAllAdmins();
	}
	
	@Override
	public List<Merchant> getAllMerchants() {
		return capstoreDao.getAllMerchants();
	}
	
	@Override
	public List<Customer> getAllCustomers(){
		return capstoreDao.getAllCustomer();
	}

	@Override
	public boolean saveAdmin(Admin admin) {
		if(!admin.getAdmin_password().equals(admin.getConfirm_password())){
			return false;
		}else{
			
			MessageDigest md=null;
					
			try {
				md=MessageDigest.getInstance("SHA");
				
			} catch (NoSuchAlgorithmException e) {
				e.printStackTrace();
			}
			
		 return capstoreDao.saveAdmin(admin);
		}
		
	}
	
	@Override
	public boolean login(Admin admin)
	{
		List<Admin> alladmins=getAllAdmins();
		boolean flag=false;
		
		for(Admin newadmin:alladmins){
			if(admin.getAdmin_password().equals(newadmin.getAdmin_password()) && 
					admin.getAdmin_Email().equals(newadmin.getAdmin_Email()))
				
			flag=true;
				
		
		else{
			flag=false;
		}
		}
		return flag;
	}
	
	@Override
	public boolean merchantlogin(Merchant merchant)
	{
		List<Merchant> allmerchants=getAllMerchants();
		boolean flag=false;
		for(Merchant newmerchant:allmerchants){
			if(merchant.getMerchant_password().equals(newmerchant.getMerchant_password()) && 
					merchant.getMerchant_Email().equals(newmerchant.getMerchant_Email()))

			flag=true;
		else{
			flag=false;
		}
		}
				return flag;
	}
	
	@Override
	public boolean customerlogin(Customer customer)
	{
		List<Customer> allcustomers=getAllCustomers();
		boolean flag=false;
		for(Customer newcustomer:allcustomers){
			if(customer.getCustomerPassword().equals(newcustomer.getCustomerPassword()) && 
					customer.getCustomer_Email().equals(newcustomer.getCustomer_Email()))

			flag=true;
		else{
			flag=false;
		}
		}
				return flag;
	}
	

	@Override
	public boolean updatePassword(Admin admin) {
		// TODO Auto-generated method stub
		List<Admin> alladmins=getAllAdmins();
		boolean flag=false;
		Admin admin2=null;
		for(Admin newadmin:alladmins){
			if(admin.getAdmin_password().equals(newadmin.getAdmin_password()) && 
					admin.getChange_password().equals(admin.getConfirm_password()) &&
					admin.getChange_password().length()>=8 &&
					!(admin.getChange_password().equals(admin.getAdmin_password())))
				
					admin2=newadmin;
				
		}
		if(!(admin2==null)){
			capstoreDao.updatePassword(admin);
			flag=true;
		}
		return flag;
	}

	@Override
	public List<Product> getProductDetails1() {
		// TODO Auto-generated method stub
		return capstoreDao.getProductDetails1();
	}

	@Override
	public List<Product> getProductDetails2() {
		// TODO Auto-generated method stub
		return capstoreDao.getProductDetails2();
	}

	@Override
	public List<Product> getProductDetails3() {
		// TODO Auto-generated method stub
		return capstoreDao.getProductDetails3();
	}

	@Override
	public List<Product> getProductDetails4() {
		// TODO Auto-generated method stub
		return capstoreDao.getProductDetails4();
	}

	@Override
	public List<Product> getProductDetails5() {
		// TODO Auto-generated method stub
		return capstoreDao.getProductDetails5();
	}

	@Override
	public List<Product> getSorted() {
		// TODO Auto-generated method stub
		return capstoreDao.getSorted();
	}

	@Override
	public List<Product> getSorted1() {
		// TODO Auto-generated method stub
		return capstoreDao.getSorted1();
	}
}
