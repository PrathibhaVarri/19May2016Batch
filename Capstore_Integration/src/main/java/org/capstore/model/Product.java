package org.capstore.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.capstore.model.Merchant;


@Entity
@Table(name="PRODUCT")
public class Product implements Serializable{
	
	private static final long serialVersionUID = 8160887160248955988L;
	
	@Id
	@GeneratedValue
	private int productId;
	@Column(name="product_Name")
	private String productName;
	
	@ManyToOne(cascade=CascadeType.REFRESH,fetch=FetchType.EAGER)
	@JoinColumn(name="merchant")
	private Merchant merchant;
	
	@Column(name="product_Quantity")
	private int quantity;
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="category")
	private Category category;
	
	@Column(name="avg_ratings")
	private int rating=1;
	
	@Column(name="product_description")
	private String description;
	
	@Column(name="product_image_location")
	private String imageLocation;
	
	@Column(name="product_price")
	private double price;
	
	@Column(name="estimated_delivery_days")
	private int estimated_Date_Delivery;

	
	public Product(){}
	


	public Product(String productName, Merchant merchant, int quantity,
			Category category, int rating, String description,
			String imageLocation, double price,
			int estimated_Date_Delivery) {
		super();
		this.productName = productName;
		this.merchant = merchant;
		this.quantity = quantity;
		this.category = category;
		this.rating = rating;
		this.description = description;
		this.imageLocation = imageLocation;
		this.price = price;
		this.estimated_Date_Delivery = estimated_Date_Delivery;
	}



	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Merchant getMerchant() {
		return merchant;
	}

	public void setMerchant(Merchant merchant) {
		this.merchant = merchant;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageLocation() {
		return imageLocation;
	}

	public void setImageLocation(String imageLocation) {
		this.imageLocation = imageLocation;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getEstimated_Date_Delivery() {
		return estimated_Date_Delivery;
	}

	public void setEstimated_Date_Delivery(int estimated_Date_Delivery) {
		this.estimated_Date_Delivery = estimated_Date_Delivery;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName="
				+ productName + ", merchant=" + merchant + ", quantity="
				+ quantity + ", category=" + category + ", rating=" + rating
				+ ", description=" + description + ", imageLocation="
				+ imageLocation + ", noOfPurchases=" + price
				+ ", estimated_Date_Delivery=" + estimated_Date_Delivery + "]";
	}
	
	
	
}
