package in.himtech.cloud.currencyexchangeservice.ctrl;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.himtech.cloud.currencyexchangeservice.domain.ExchangeValue;
import in.himtech.cloud.currencyexchangeservice.repo.CurrencyExchangeRepository;

@RestController
@RequestMapping("currency-exchange")
public class CurrencyExchangeController {
	
	@Autowired
	private Environment env;
	
	@Autowired
	CurrencyExchangeRepository repository;

	@GetMapping(path="/from/{from}/to/{to}")
	public ExchangeValue getExchangeValue(@PathVariable String from, @PathVariable String to) {
		
		ExchangeValue ev =  repository.findByFromAndTo(from, to);
		ev.setPort(env.getProperty("local.server.port"));
		return ev;
	}
}
