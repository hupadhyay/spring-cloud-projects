package in.himtech.cloud.currencyconversionservice.client;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import in.himtech.cloud.currencyconversionservice.domain.CurrencyConversion;

@FeignClient(name="currency-exchange-service")
@RibbonClient(name="currency-exchange-service")
public interface RestClientProxy {

	@RequestMapping("currency-exchange/from/{from}/to/{to}")
	CurrencyConversion getCurrencyExchangeValue(@PathVariable("from") String from, @PathVariable("to") String to);
}
