package org.capstore.model;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.Future;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.tuple.GeneratedValueGeneration;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Discount implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name="discount_id")
	private int discountId;
	

	@Range(min=1 ,max=100, message="* discount range should be between 1 to 100 *")
	private int discount_percentage;
	
	@Future
	@DateTimeFormat(pattern="dd-MMM-yyyy")
	@Temporal(TemporalType.DATE)
	@Column(name="d_startdate")
	private Date startDate;
	
	@Future(message="*End date should be future*")
	@DateTimeFormat(pattern="dd-MMM-yyyy")
	@Temporal(TemporalType.DATE)
	@Column(name="d_enddate")
	private Date endDate;
	
	/*@ManyToOne(cascade=CascadeType.REFRESH, fetch=FetchType.EAGER)
	@JoinColumn(name="product_id")*/
	@Column(name="product_id")
	@Range(min=1, message="* Please enter product Id *")
	private int product;
	
	
	public Discount(){}

	public Discount(int discountId, int discount_percentage, Date startDate, Date endDate,
			int product) {
		super();
		this.discountId = discountId;
		this.discount_percentage = discount_percentage;
		this.startDate = startDate;
		this.endDate = endDate;
		this.product = product;
	}

	public int getDiscountId() {
		return discountId;
	}

	public void setDiscountId(int discountId) {
		this.discountId = discountId;
	}

	public int getDiscount_percentage() {
		return discount_percentage;
	}

	public void setDiscount_percentage(int discount_percentage) {
		this.discount_percentage = discount_percentage;
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

	public int getProduct() {
		return product;
	}

	public void setProduct(int product) {
		this.product = product;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Discount [discountId=" + discountId + ", discount_percentage="
				+ discount_percentage + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", product=" + product + "]";
	}

}
