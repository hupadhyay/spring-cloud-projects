package in.himtech.cloud.currencyexchangeservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.himtech.cloud.currencyexchangeservice.domain.ExchangeValue;

public interface CurrencyExchangeRepository extends JpaRepository<ExchangeValue, Integer> {
	
	ExchangeValue findByFromAndTo(String from, String to);

}
