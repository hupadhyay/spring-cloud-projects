package in.himtech.cloud.currencyconversionservice.ctrl;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import in.himtech.cloud.currencyconversionservice.client.RestClientProxy;
import in.himtech.cloud.currencyconversionservice.domain.CurrencyConversion;

@RestController
@RequestMapping(path="currency-conversion")
public class CurrencyConversionController {
	
	@Autowired
	private RestClientProxy restClient;
	
	@GetMapping(path="/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversion getCurrencyConversion(@PathVariable String from, @PathVariable String to, @PathVariable int quantity) {
		
		
		RestTemplate restTemplate = new RestTemplate();
		Map<String, String>uriVariables = new HashMap<>();
		uriVariables.put("from", from);
		uriVariables.put("to", to);
		
		ResponseEntity<CurrencyConversion> responseEntity = restTemplate.getForEntity("http://localhost:8000/currency-exchange/from/{from}/to/{to}", CurrencyConversion.class, uriVariables);
		CurrencyConversion cc = responseEntity.getBody();
		cc.setQuantity(quantity);
		cc.setConversionValue(cc.getMultiple().multiply(BigDecimal.valueOf(quantity)));
		
		return cc;
	}
	
	@GetMapping(path="/feign/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversion getFeignCurrencyConversion(@PathVariable String from, @PathVariable String to, @PathVariable int quantity) {
		

		CurrencyConversion cc = restClient.getCurrencyExchangeValue(from, to);
		cc.setQuantity(quantity);
		cc.setConversionValue(cc.getMultiple().multiply(BigDecimal.valueOf(quantity)));
		
		return cc;
	}
	

}
