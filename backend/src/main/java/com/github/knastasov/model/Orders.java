package com.github.knastasov.model;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "orders")
public class Orders {

	@Id
	private String id;
	private List<Users> users;

	private List<Products> products;

	private ShippingAddressPOJO shippingAddress;

	private String paymentMethod;

	private PaymentResult paymentResult;

	private BigDecimal taxPrice;

	private BigDecimal shippingPrice;

	private BigDecimal totalPrice;

	private Boolean isPaid;

	private Date paidAt;

	private Boolean isDelivered;

	private Date deliveredAt;

	// timestamp
	private ZonedDateTime time;

	public Orders() {
		super();
	}

	public Orders(List<Users> users, List<Products> products, ShippingAddressPOJO shippingAddress, String paymentMethod,
			PaymentResult paymentResult, BigDecimal taxPrice, BigDecimal shippingPrice, BigDecimal totalPrice,
			Boolean isPaid, Date paidAt, Boolean isDelivered, Date deliveredAt, ZonedDateTime time) {
		super();
		this.users = users;
		this.products = products;
		this.shippingAddress = shippingAddress;
		this.paymentMethod = paymentMethod;
		this.paymentResult = paymentResult;
		this.taxPrice = taxPrice;
		this.shippingPrice = shippingPrice;
		this.totalPrice = totalPrice;
		this.isPaid = isPaid;
		this.paidAt = paidAt;
		this.isDelivered = isDelivered;
		this.deliveredAt = deliveredAt;
		this.time = time;
	}

	public List<Users> getUsers() {
		return users;
	}

	public void setUsers(List<Users> users) {
		this.users = users;
	}

	public List<Products> getProducts() {
		return products;
	}

	public void setProducts(List<Products> products) {
		this.products = products;
	}

	public ShippingAddressPOJO getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(ShippingAddressPOJO shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public PaymentResult getPaymentResult() {
		return paymentResult;
	}

	public void setPaymentResult(PaymentResult paymentResult) {
		this.paymentResult = paymentResult;
	}

	public BigDecimal getTaxPrice() {
		return taxPrice;
	}

	public void setTaxPrice(BigDecimal taxPrice) {
		this.taxPrice = taxPrice;
	}

	public BigDecimal getShippingPrice() {
		return shippingPrice;
	}

	public void setShippingPrice(BigDecimal shippingPrice) {
		this.shippingPrice = shippingPrice;
	}

	public BigDecimal getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Boolean getIsPaid() {
		return isPaid;
	}

	public void setIsPaid(Boolean isPaid) {
		this.isPaid = isPaid;
	}

	public Date getPaidAt() {
		return paidAt;
	}

	public void setPaidAt(Date paidAt) {
		this.paidAt = paidAt;
	}

	public Boolean getIsDelivered() {
		return isDelivered;
	}

	public void setIsDelivered(Boolean isDelivered) {
		this.isDelivered = isDelivered;
	}

	public Date getDeliveredAt() {
		return deliveredAt;
	}

	public void setDeliveredAt(Date deliveredAt) {
		this.deliveredAt = deliveredAt;
	}

	public ZonedDateTime getTime() {
		return time;
	}

	public void setTime(ZonedDateTime time) {
		this.time = time;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Orders [id=" + id + ", users=" + users + ", products=" + products + ", shippingAddress="
				+ shippingAddress + ", paymentMethod=" + paymentMethod + ", paymentResult=" + paymentResult
				+ ", taxPrice=" + taxPrice + ", shippingPrice=" + shippingPrice + ", totalPrice=" + totalPrice
				+ ", isPaid=" + isPaid + ", paidAt=" + paidAt + ", isDelivered=" + isDelivered + ", deliveredAt="
				+ deliveredAt + ", time=" + time + "]";
	}

}
