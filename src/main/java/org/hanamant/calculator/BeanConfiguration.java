package org.hanamant.calculator;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author hguggari
 *
 */
@Configuration
public class BeanConfiguration {
	private static final Logger logger = Logger.getLogger(BeanConfiguration.class);

	public BeanConfiguration() {
	}

	@Bean
	public CalculatorService getCalculatorservice() {
		logger.info("CalculatorService creation has been called");
		return new CalculatorServiceImpl();
	}
	
	@Bean
	public CalculatorClient getCalculatorClient() {
		return new CalculatorClient();
	}
}
