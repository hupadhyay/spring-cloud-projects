package in.himtech.cloud.currencyexchangeservice.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="exchange_value")
public class ExchangeValue {

	@Id
	private Integer id;
	
	@Column(name="curr_from")
	private String from;
	
	@Column(name="curr_to")
	private String to;
	
	private BigDecimal multiple;
	
	private String port;

	public ExchangeValue() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ExchangeValue(Integer id, String from, String to, BigDecimal multiple) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.multiple = multiple;
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

	public BigDecimal getMultiple() {
		return multiple;
	}

	public void setMultiple(BigDecimal multiple) {
		this.multiple = multiple;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}
}
