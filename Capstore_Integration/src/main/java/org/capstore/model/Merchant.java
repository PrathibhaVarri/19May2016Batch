package org.capstore.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Future;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Merchant implements Serializable {

	@Id
	@GeneratedValue()
	private int MerchantId;
	
	@NotEmpty(message="*Pls enter First Name:")
	private String MerchantFName;
	@NotEmpty(message="*Pls enter First Name:")
	private String MerchantLName;
	
	@NotEmpty(message="*Pls enter Email Id:")
	@Email(message="*Pls enter Email Id:")
	private String Merchant_Email;
	
	@Length(min=8,message="Atleast 8 Characters")
	@NotEmpty(message="Must not be empty..!")
	private String Merchant_password;
	
	@Transient
	private String ConfirmPassword;
	
	@NotEmpty(message="*Pls enter contact!!")
	private String merchant_contact;
	
	@Transient
	private String merchant_gender;
	
	
	private int Merchanttype;
	
	@NotEmpty(message="*Pls enter dNo:")
	private String P_MDNo;
	
	@NotEmpty(message="*Pls enter street:")
	private String P_MStreet;
	
	@NotEmpty(message="*Pls enter your city:")
	private String P_MCity;
	
	@NotEmpty(message="*Pls enter your state:")
	private String P_MState;
	
	@NotEmpty(message="*Pls enter your pincode:")
	private String P_MPin;
	
	
	private String W_MDno;
	private String W_MStreet;
	private String W_MCity;
	private String W_MState;
	private String W_MPin;
	
	
	private int MerchantInt_Payment;
	
	@Past
	@DateTimeFormat(pattern="dd-MMM-YYYY")
	private Date startDate;
	
	@Future
	@DateTimeFormat(pattern="dd-MMM-YYYY")
	private Date endDate;
	
	
	
	public Merchant(){}



	public Merchant(int merchantId, String merchantFName, String merchantLName,
			String merchant_Email, String merchant_password,
			String confirmPassword, String merchant_contact,
			String merchant_gender, int merchanttype, String p_MDNo,
			String p_MStreet, String p_MCity, String p_MState, String p_MPin,
			String w_MDno, String w_MStreet, String w_MCity, String w_MState,
			String w_MPin, int merchantInt_Payment, Date startDate, Date endDate) {
		super();
		MerchantId = merchantId;
		MerchantFName = merchantFName;
		MerchantLName = merchantLName;
		Merchant_Email = merchant_Email;
		Merchant_password = merchant_password;
		ConfirmPassword = confirmPassword;
		this.merchant_contact = merchant_contact;
		this.merchant_gender = merchant_gender;
		Merchanttype = merchanttype;
		P_MDNo = p_MDNo;
		P_MStreet = p_MStreet;
		P_MCity = p_MCity;
		P_MState = p_MState;
		P_MPin = p_MPin;
		W_MDno = w_MDno;
		W_MStreet = w_MStreet;
		W_MCity = w_MCity;
		W_MState = w_MState;
		W_MPin = w_MPin;
		MerchantInt_Payment = merchantInt_Payment;
		this.startDate = startDate;
		this.endDate = endDate;
	}



	public int getMerchantId() {
		return MerchantId;
	}



	public void setMerchantId(int merchantId) {
		MerchantId = merchantId;
	}



	public String getMerchantFName() {
		return MerchantFName;
	}



	public void setMerchantFName(String merchantFName) {
		MerchantFName = merchantFName;
	}



	public String getMerchantLName() {
		return MerchantLName;
	}



	public void setMerchantLName(String merchantLName) {
		MerchantLName = merchantLName;
	}



	public String getMerchant_Email() {
		return Merchant_Email;
	}



	public void setMerchant_Email(String merchant_Email) {
		Merchant_Email = merchant_Email;
	}



	public String getMerchant_password() {
		return Merchant_password;
	}



	public void setMerchant_password(String merchant_password) {
		Merchant_password = merchant_password;
	}



	public String getConfirmPassword() {
		return ConfirmPassword;
	}



	public void setConfirmPassword(String confirmPassword) {
		ConfirmPassword = confirmPassword;
	}



	public String getMerchant_contact() {
		return merchant_contact;
	}



	public void setMerchant_contact(String merchant_contact) {
		this.merchant_contact = merchant_contact;
	}



	public String getMerchant_gender() {
		return merchant_gender;
	}



	public void setMerchant_gender(String merchant_gender) {
		this.merchant_gender = merchant_gender;
	}



	public int getMerchanttype() {
		return Merchanttype;
	}



	public void setMerchanttype(int merchanttype) {
		Merchanttype = merchanttype;
	}



	public String getP_MDNo() {
		return P_MDNo;
	}



	public void setP_MDNo(String p_MDNo) {
		P_MDNo = p_MDNo;
	}



	public String getP_MStreet() {
		return P_MStreet;
	}



	public void setP_MStreet(String p_MStreet) {
		P_MStreet = p_MStreet;
	}



	public String getP_MCity() {
		return P_MCity;
	}



	public void setP_MCity(String p_MCity) {
		P_MCity = p_MCity;
	}



	public String getP_MState() {
		return P_MState;
	}



	public void setP_MState(String p_MState) {
		P_MState = p_MState;
	}



	public String getP_MPin() {
		return P_MPin;
	}



	public void setP_MPin(String p_MPin) {
		P_MPin = p_MPin;
	}



	public String getW_MDno() {
		return W_MDno;
	}



	public void setW_MDno(String w_MDno) {
		W_MDno = w_MDno;
	}



	public String getW_MStreet() {
		return W_MStreet;
	}



	public void setW_MStreet(String w_MStreet) {
		W_MStreet = w_MStreet;
	}



	public String getW_MCity() {
		return W_MCity;
	}



	public void setW_MCity(String w_MCity) {
		W_MCity = w_MCity;
	}



	public String getW_MState() {
		return W_MState;
	}



	public void setW_MState(String w_MState) {
		W_MState = w_MState;
	}



	public String getW_MPin() {
		return W_MPin;
	}



	public void setW_MPin(String w_MPin) {
		W_MPin = w_MPin;
	}



	public int getMerchantInt_Payment() {
		return MerchantInt_Payment;
	}



	public void setMerchantInt_Payment(int merchantInt_Payment) {
		MerchantInt_Payment = merchantInt_Payment;
	}



	public Date getStartDate() {
		return startDate;
	}



	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}



	public Date getEndDate() {
		return endDate;
	}



	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}



	@Override
	public String toString() {
		return "Merchant [MerchantId=" + MerchantId + ", MerchantFName="
				+ MerchantFName + ", MerchantLName=" + MerchantLName
				+ ", Merchant_Email=" + Merchant_Email + ", Merchant_password="
				+ Merchant_password + ", ConfirmPassword=" + ConfirmPassword
				+ ", merchant_contact=" + merchant_contact
				+ ", merchant_gender=" + merchant_gender + ", Merchanttype="
				+ Merchanttype + ", P_MDNo=" + P_MDNo + ", P_MStreet="
				+ P_MStreet + ", P_MCity=" + P_MCity + ", P_MState=" + P_MState
				+ ", P_MPin=" + P_MPin + ", W_MDno=" + W_MDno + ", W_MStreet="
				+ W_MStreet + ", W_MCity=" + W_MCity + ", W_MState=" + W_MState
				+ ", W_MPin=" + W_MPin + ", MerchantInt_Payment="
				+ MerchantInt_Payment + ", startDate=" + startDate
				+ ", endDate=" + endDate + "]";
	}



	


	
}

	



	
	
	

	

