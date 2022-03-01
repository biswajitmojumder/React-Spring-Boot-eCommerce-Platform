package com.github.knastasov.model;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")
public class Products {
	@Id
	private String _id;
	private String name;
	private String image;
	private String brand;
	private String category;
	private BigDecimal price;
	private BigDecimal countInStock;
	private BigDecimal rating;
	private BigDecimal numReviews;

	public Products() {
		super();
	}

	public Products(String name, String image, String brand, String category, BigDecimal price, BigDecimal countInStock,
			BigDecimal rating, BigDecimal numReviews) {
		super();
		this.name = name;
		this.image = image;
		this.brand = brand;
		this.category = category;
		this.price = price;
		this.countInStock = countInStock;
		this.rating = rating;
		this.numReviews = numReviews;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getCountInStock() {
		return countInStock;
	}

	public void setCountInStock(BigDecimal countInStock) {
		this.countInStock = countInStock;
	}

	public BigDecimal getRating() {
		return rating;
	}

	public void setRating(BigDecimal rating) {
		this.rating = rating;
	}

	public BigDecimal getNumReviews() {
		return numReviews;
	}

	public void setNumReviews(BigDecimal numReviews) {
		this.numReviews = numReviews;
	}

	public String getId() {
		return _id;
	}

	@Override
	public String toString() {
		return "Products [id=" + _id + ", name=" + name + ", image=" + image + ", brand=" + brand + ", category="
				+ category + ", price=" + price + ", countInStock=" + countInStock + ", rating=" + rating
				+ ", numReviews=" + numReviews + "]";
	}

}
