/**
 * 
 */
package org.hanamant.calculator;

import org.springframework.stereotype.Component;

/**
 * @author hguggari
 *
 */

@Component
public interface CalculatorService {
	
	public Integer addition(Integer p1, Integer p2) throws Exception;
	
	public Integer subtraction(Integer p1, Integer p2) throws Exception;
	
	public Integer multiply(Integer p1, Integer p2) throws Exception;
	
	public Integer divide(Integer p1, Integer p2) throws Exception;
	
	public Integer modulus(Integer p1, Integer p2) throws Exception;
}
