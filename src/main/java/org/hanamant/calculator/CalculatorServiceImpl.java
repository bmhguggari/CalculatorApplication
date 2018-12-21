/**
 * 
 */
package org.hanamant.calculator;

import org.apache.log4j.Logger;

/**
 * @author hguggari
 *
 */
public class CalculatorServiceImpl implements CalculatorService {
	
	private static final Logger logger = Logger.getLogger(CalculatorServiceImpl.class);

	public Integer addition(Integer p1, Integer p2) throws Exception {
		logger.info("Addition has been called with parameter " + p1 + " and " + p2);
		return p1 + p2;
	}

	public Integer subtraction(Integer p1, Integer p2) throws Exception {
		logger.info("Subtraction has been called with parameter " + p1 + " and " + p2);
		return p1 - p2;
	}

	public Integer multiply(Integer p1, Integer p2) throws Exception {
		logger.info("Multiply has been called with parameter " + p1 + " and " + p2);
		return p1 * p2;
	}

	public Integer divide(Integer p1, Integer p2) throws Exception {
		logger.info("Division has been called with parameter " + p1 + " and " + p2);
		return p1 /p2;
	}

	public Integer modulus(Integer p1, Integer p2) throws Exception {
		logger.info("Modulus has been called with parameter " + p1 + " and " + p2);
		return p1 % p2;
	}
	
}
