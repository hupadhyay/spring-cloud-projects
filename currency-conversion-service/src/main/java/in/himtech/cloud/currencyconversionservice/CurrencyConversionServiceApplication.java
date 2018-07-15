package in.himtech.cloud.currencyconversionservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import brave.sampler.Sampler;

@SpringBootApplication
@EnableFeignClients(basePackages="in.himtech.cloud.currencyconversionservice.client")
@EnableDiscoveryClient
public class CurrencyConversionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConversionServiceApplication.class, args);
	}
	
	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}
}
