package org.capstore.dao;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.capstore.model.Admin;
import org.capstore.model.Category;
import org.capstore.model.Customer;
import org.capstore.model.Discount;
import org.capstore.model.Merchant;
import org.capstore.model.Product;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("capstoreDao")
public class CapstoreDaoImp implements CapstoreDao{

	
	@Autowired
	private SessionFactory sessionFactory;
		

	@Override
	public List<Category> getAllCategories() {
		
		return sessionFactory.getCurrentSession().createQuery("from Category").list();
	}


	@Override
	public List<Product> getProductDetails() {
		return sessionFactory.getCurrentSession().createQuery("from Product").list();
	}


	@Override
	public List<Product> getProductIdDetails(int productId) {
		
		return null;
	}
	
	@Override
	public List<Customer> getAllCustomer() {
		return sessionFactory.getCurrentSession().createQuery("from Customer").list();
	}

	@Override
	public void saveCustomer(Customer customer) {
		sessionFactory.getCurrentSession().save(customer);
}
	@Override
	public void saveMerchant(Merchant merchant) {
		sessionFactory.getCurrentSession().save(merchant);
}
	@Override
	public void saveCategory(Category category) {
		sessionFactory.getCurrentSession().save(category);
	}

	@Override
	public void saveDiscount(Discount d) {
		//System.out.println(d);
		sessionFactory.getCurrentSession().save(d);
	}
	
	@Override
	public List<Admin> getAllAdmins() {
		return sessionFactory.getCurrentSession().createQuery("from Admin").list();
	}
	
	@Override
	public  List<Merchant> getAllMerchants() {
		return sessionFactory.getCurrentSession().createQuery("from Merchant").list();
	}

	@Override
	public boolean saveAdmin(Admin admin) {
		sessionFactory.getCurrentSession().save(admin);
		return true;
	}
	
	@Override
	public void updatePassword(Admin admin1) {
		System.out.println(admin1.getChange_password().toString());
		sessionFactory.getCurrentSession().createSQLQuery("update admin set admin_password='"+admin1.getChange_password().toString()+"' where admin_password='"+admin1.getAdmin_password().toString()+"'").executeUpdate();
		
	}
	
	@Override
	public List<Product> getSorted() {
		return sessionFactory.getCurrentSession().createQuery("from Product order by price").list();
	}
	@Override
	public List<Product> getSorted1() {
		return sessionFactory.getCurrentSession().createQuery("from Product order by price DESC").list();
	}
	@Override
	public List<Product> getProductDetails1() {
		return sessionFactory.getCurrentSession().createQuery("from Product where category=89").list();
	}



	@Override
	public List<Product> getProductDetails2() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Product where category=90").list();
	}


	@Override
	public List<Product> getProductDetails3() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Product where category=91").list();
	}


	@Override
	public List<Product> getProductDetails4() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Product where category=93").list();
	}


	@Override
	public List<Product> getProductDetails5() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Product where category=182").list();
	}

}
