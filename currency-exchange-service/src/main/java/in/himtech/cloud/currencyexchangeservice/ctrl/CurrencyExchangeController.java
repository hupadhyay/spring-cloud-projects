package in.himtech.cloud.currencyexchangeservice.ctrl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
	
	private Logger logger = LoggerFactory.getLogger(CurrencyExchangeController.class);

	@GetMapping(path="/from/{from}/to/{to}")
	public ExchangeValue getExchangeValue(@PathVariable String from, @PathVariable String to) {
		
		ExchangeValue ev =  repository.findByFromAndTo(from, to);
		ev.setPort(env.getProperty("local.server.port"));
		
		logger.info("Response from currency-exchange: {}", ev);
		return ev;
	}
}
