package org.capstore.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;


@Entity
public class Admin {

	@Id
	@GeneratedValue
	private int adminId;
	
	@NotEmpty(message="Must not be empty..!")
	private String adminFname;
	
	@NotEmpty(message="Must not be empty..!")
	private String adminLname;
	
	@NotEmpty(message="Must not be empty..!")
	@Email(message="Enter Valid Email")
	private String admin_Email;
	
	@Length(min=8,message="Atleast 8 Characters")
	private String admin_password;
	
	@Transient
	@NotEmpty(message="Can not be empty..!")
	private String confirm_password;

	@Transient
	private String change_password;

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getAdminFname() {
		return adminFname;
	}

	public void setAdminFname(String adminFname) {
		this.adminFname = adminFname;
	}

	public String getAdminLname() {
		return adminLname;
	}

	public void setAdminLname(String adminLname) {
		this.adminLname = adminLname;
	}

	public String getAdmin_Email() {
		return admin_Email;
	}

	public void setAdmin_Email(String admin_Email) {
		this.admin_Email = admin_Email;
	}

	public String getAdmin_password() {
		return admin_password;
	}

	public void setAdmin_password(String admin_password) {
		this.admin_password = admin_password;
	}

	public String getConfirm_password() {
		return confirm_password;
	}

	public void setConfirm_password(String confirm_password) {
		this.confirm_password = confirm_password;
	}

	public String getChange_password() {
		return change_password;
	}

	public void setChange_password(String change_password) {
		this.change_password = change_password;
	}
	public Admin(){}

	public Admin(int adminId, String adminFname, String adminLname,
			String admin_Email, String admin_password, String confirm_password,
			String change_password) {
		super();
		this.adminId = adminId;
		this.adminFname = adminFname;
		this.adminLname = adminLname;
		this.admin_Email = admin_Email;
		this.admin_password = admin_password;
		this.confirm_password = confirm_password;
		this.change_password = change_password;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminFname=" + adminFname
				+ ", adminLname=" + adminLname + ", admin_Email=" + admin_Email
				+ ", admin_password=" + admin_password + ", confirm_password="
				+ confirm_password + ", change_password=" + change_password
				+ "]";
	}
	
	
	
}
