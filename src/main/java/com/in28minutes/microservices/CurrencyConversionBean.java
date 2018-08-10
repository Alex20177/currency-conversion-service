package com.in28minutes.microservices;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class CurrencyConversionBean {

	private long id;
	private String from;
	private String to;
	private BigDecimal conversionMultiple;
	private BigDecimal quantity;
	private BigDecimal totalCalculateAmount;
	private int port;
	
	public CurrencyConversionBean() {
	}
	
	public CurrencyConversionBean(long id, String from, String to, BigDecimal conversionMultiple, BigDecimal quantity,
			BigDecimal totalCalculateAmount, int port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
		this.quantity = quantity;
		this.totalCalculateAmount = totalCalculateAmount;
		this.port=port;
	}
	
}//Close CurrencyConversionBean class.
