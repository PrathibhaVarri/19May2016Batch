package org.capstore.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.transaction.annotation.Transactional;

@Entity
public class Customer implements Serializable {
	@Id
	@GeneratedValue
	private int CustomerID;
	
	@NotEmpty(message="Must not be empty..!")
	private String CustomerFName;
	
	@NotEmpty(message="Must not be empty..!")
	private String CustomerLName;
	
	@NotEmpty(message="Must be male/female..!")
	private String Customer_Gender;
	
	@NotEmpty(message="Must not be empty..!")
	@Email(message="Enter Valid Email")
	private String Customer_Email;
	
	@Length(min=8,message="Atleast 8 Characters")
	@NotEmpty(message="Must not be empty..!")
	private String CustomerPassword;
	
	@Transient
	@NotEmpty(message="must be same as abovePassword")
	private String ConfirmPassword;
	@Size(min=10, max=10, message="plz enter contact")
	private String Cust_Contact;
	
	private String Cust_Dno;
	private String Cust_Street;
	private String Cust_City;
	private String Cust_State;
	private String Cust_Pincode;
	
	public Customer(){}
	public Customer(int customerID, String customerFName, String customerLName,
			String customer_Gender, String customer_Email,
			String customerPassword, String confirmPassword,
			String cust_Contact, String cust_Dno, String cust_Street,
			String cust_City, String cust_State, String cust_Pincode) {
		super();
		CustomerID = customerID;
		CustomerFName = customerFName;
		CustomerLName = customerLName;
		Customer_Gender = customer_Gender;
		Customer_Email = customer_Email;
		CustomerPassword = customerPassword;
		ConfirmPassword = confirmPassword;
		Cust_Contact = cust_Contact;
		Cust_Dno = cust_Dno;
		Cust_Street = cust_Street;
		Cust_City = cust_City;
		Cust_State = cust_State;
		Cust_Pincode = cust_Pincode;
	}

	public String getConfirmPassword() {
		return ConfirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		ConfirmPassword = confirmPassword;
	}


	

	public Customer(int customerID, String customerFName,
			String customerLName, String customer_Gender,
			String customer_Email, String customerPassword,
			String cust_Contact, String cust_Dno, String cust_Street,
			String cust_City, String cust_State, String cust_Pincode) {
		super();
		CustomerID = customerID;
		CustomerFName = customerFName;
		CustomerLName = customerLName;
		Customer_Gender = customer_Gender;
		Customer_Email = customer_Email;
		CustomerPassword = customerPassword;
		Cust_Contact = cust_Contact;
		Cust_Dno = cust_Dno;
		Cust_Street = cust_Street;
		Cust_City = cust_City;
		Cust_State = cust_State;
		Cust_Pincode = cust_Pincode;
	}

	public int getCustomerID() {
		return CustomerID;
	}

	public void setCustomerID(int customerID) {
		CustomerID = customerID;
	}

	public String getCustomerFName() {
		return CustomerFName;
	}

	public void setCustomerFName(String customerFName) {
		CustomerFName = customerFName;
	}

	public String getCustomerLName() {
		return CustomerLName;
	}

	public void setCustomerLName(String customerLName) {
		CustomerLName = customerLName;
	}

	public String getCustomer_Gender() {
		return Customer_Gender;
	}

	public void setCustomer_Gender(String customer_Gender) {
		Customer_Gender = customer_Gender;
	}

	public String getCustomer_Email() {
		return Customer_Email;
	}

	public void setCustomer_Email(String customer_Email) {
		Customer_Email = customer_Email;
	}

	public String getCustomerPassword() {
		return CustomerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		CustomerPassword = customerPassword;
	}

	public String getCust_Contact() {
		return Cust_Contact;
	}

	public void setCust_Contact(String cust_Contact) {
		Cust_Contact = cust_Contact;
	}

	public String getCust_Dno() {
		return Cust_Dno;
	}

	public void setCust_Dno(String cust_Dno) {
		Cust_Dno = cust_Dno;
	}

	public String getCust_Street() {
		return Cust_Street;
	}

	public void setCust_Street(String cust_Street) {
		Cust_Street = cust_Street;
	}

	public String getCust_City() {
		return Cust_City;
	}

	public void setCust_City(String cust_City) {
		Cust_City = cust_City;
	}

	public String getCust_State() {
		return Cust_State;
	}

	public void setCust_State(String cust_State) {
		Cust_State = cust_State;
	}

	public String getCust_Pincode() {
		return Cust_Pincode;
	}

	public void setCust_Pincode(String cust_Pincode) {
		Cust_Pincode = cust_Pincode;
	}

	@Override
	public String toString() {
		return "Customer [CustomerID=" + CustomerID + ", CustomerFName="
				+ CustomerFName + ", CustomerLName=" + CustomerLName
				+ ", Customer_Gender=" + Customer_Gender + ", Customer_Email="
				+ Customer_Email + ", CustomerPassword=" + CustomerPassword
				+ ", ConfirmPassword=" + ConfirmPassword + ", Cust_Contact="
				+ Cust_Contact + ", Cust_Dno=" + Cust_Dno + ", Cust_Street="
				+ Cust_Street + ", Cust_City=" + Cust_City + ", Cust_State="
				+ Cust_State + ", Cust_Pincode=" + Cust_Pincode + "]";
	}
	
	
	
}
