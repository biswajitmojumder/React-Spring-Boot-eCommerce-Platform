package com.github.knastasov.model;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "orders")
public class Orders {

	@Id
	private String id;
	
	//reference User model
	//reference products
	
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
	
	
	
}
