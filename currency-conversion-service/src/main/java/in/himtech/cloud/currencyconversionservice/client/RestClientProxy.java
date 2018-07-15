package in.himtech.cloud.currencyconversionservice.client;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import in.himtech.cloud.currencyconversionservice.domain.CurrencyConversion;

// with zuul proxy: give the zuul service name and update the @RequestMapping
@FeignClient(name="zuul-api-gateway-service")
// without zuul proxy
//@FeignClient(name="currency-exchange-service")
@RibbonClient(name="currency-exchange-service")
public interface RestClientProxy {

	//@RequestMapping("currency-exchange/from/{from}/to/{to}") <update it for zuul proxy>
	@RequestMapping("currency-exchange-service/currency-exchange/from/{from}/to/{to}")
	CurrencyConversion getCurrencyExchangeValue(@PathVariable("from") String from, @PathVariable("to") String to);
}
