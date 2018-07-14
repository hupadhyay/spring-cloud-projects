package in.himtech.cloud.currencyconversionservice.domain;

import java.math.BigDecimal;

public class CurrencyConversion {
	
	private Integer id;
	private String from;
	private String to;
	private int quantity;
	private BigDecimal multiple;
	private BigDecimal conversionValue;
	private String port;
		
	public CurrencyConversion() {
		super();
	}

	public CurrencyConversion(Integer id, String from, String to, int quantity, BigDecimal multiple,
			BigDecimal conversionValue, String port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.quantity = quantity;
		this.multiple = multiple;
		this.conversionValue = conversionValue;
		this.port = port;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getMultiple() {
		return multiple;
	}

	public void setMultiple(BigDecimal multiple) {
		this.multiple = multiple;
	}

	public BigDecimal getConversionValue() {
		return conversionValue;
	}

	public void setConversionValue(BigDecimal conversionValue) {
		this.conversionValue = conversionValue;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}
	
}
