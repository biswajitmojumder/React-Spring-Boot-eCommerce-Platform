package com.github.knastasov.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="payment_result")
public class PaymentResult {

	@Id
	private String id;
	private String status;
	private String updateTime;
	private String emailAddress;
}
