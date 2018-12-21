package org.hanamant.calculator;


import java.util.Scanner;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @author hguggari
 *
 */
@ComponentScan(basePackages="org.hanamant.calculator")
@Component
public class CalculatorClient {
	static final Logger logger = Logger.getLogger(CalculatorClient.class); 
	
	@Autowired
	CalculatorService calService ;
	
	public CalculatorClient() {
	}
	
	public static void main(String[] args) {
		logger.debug("Calculator application has started..");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(BeanConfiguration.class);
		context.refresh();
		
		CalculatorClient client = context.getBean(CalculatorClient.class);
		
		logger.debug("Client object has been created" + client);
		
		client.executeService(context);
		
		context.close();
		
		logger.debug("End of the CalculatorService application!!!");
	}
	
	public void executeService(AnnotationConfigApplicationContext context) {
		calService = context.getBean(CalculatorService.class);
		logger.debug("Calculator Service object has been created" + calService);
		Scanner scan = new Scanner(System.in);
		int option = -1;
		int operand1 = -1, operand2 = -1, result = -1;
		do {
			logger.debug("\nPlease selection you option");
			logger.debug("\n1. Addition \n2. Substraction \n3. Multiply \n4. Divide \n5. Modulus \n6. Exit");
			option = scan.nextInt();
			scan.nextLine();
			switch(option) {
			case 1:
				logger.debug("Enter two number for addition\n");
				operand1 = scan.nextInt();
				operand2 = scan.nextInt();
				try {
					result = calService.addition(operand1, operand2);
				} catch (Exception e) {
					logger.error("Some exception in addition " +e);
				}
				logger.debug("\nResult of addition of " + operand1 + " and " + operand2 + " is " + result);
				break;
			case 2:
				logger.debug("Enter two number for subtraction\n");
				operand1 = scan.nextInt();
				operand2 = scan.nextInt();
				try {
					result = calService.subtraction(operand1, operand2);
				} catch (Exception e) {
					logger.error("Some exception in subtraction " + e);
				}
				logger.debug("\nResult of subtraction of " + operand1 + " and " + operand2 + " is " + result);
				break;
			case 3:
				logger.debug("Enter two number for multiplication \n");
				operand1 = scan.nextInt();
				operand2 = scan.nextInt();
				try {
					result = calService.multiply(operand1, operand2);
				} catch (Exception e) {
					logger.error("Some exception in multiplication " +e);
				}
				logger.debug("\nResult of multiplication of " + operand1 + " and " + operand2 + " is " + result);
				break;
			case 4:
				logger.debug("Enter two number for division\n");
				operand1 = scan.nextInt();
				operand2 = scan.nextInt();
				try {
					result = calService.divide(operand1, operand2);
				} catch (Exception e) {
					logger.error("Some exception in division " +e);
				}
				logger.debug("\nResult of division of " + operand1 + " and " + operand2 + " is " + result);
				break;
			case 5:
				logger.debug("Enter two number for modulus\n");
				operand1 = scan.nextInt();
				operand2 = scan.nextInt();
				try {
					result = calService.modulus(operand1, operand2);
				} catch (Exception e) {
					logger.error("Some exception in modulus " +e);
				}
				logger.debug("\nResult of modulus of " + operand1 + " and " + operand2 + " is " + result);
				break;
			case 6:
				logger.debug("Thanks for using Calculator Serivice Application.. Bye..!!\n");
				break;
			default:
				
			}
		} while(option != 6);
		scan.close();
	}
}
