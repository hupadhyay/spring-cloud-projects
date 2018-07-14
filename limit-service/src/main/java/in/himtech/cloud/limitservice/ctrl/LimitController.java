package in.himtech.cloud.limitservice.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.himtech.cloud.limitservice.config.AppConfiguration;
import in.himtech.cloud.limitservice.model.LimitConfig;

@RestController
public class LimitController {
	
	@Autowired
	private AppConfiguration config;
	
	@RequestMapping(path="/limit")
	public LimitConfig getConfiguration() {
		return new LimitConfig(1000, 10);
	}
	/**
	 * read value form applicaiton properties
	 * @return
	 */
	@RequestMapping(path="/appli_proper")
	public LimitConfig readFromConfiguration() {
		return new LimitConfig(config.getMaximum(), config.getMinimum());
	}
}
