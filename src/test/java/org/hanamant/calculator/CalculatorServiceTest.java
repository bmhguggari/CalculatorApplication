package org.hanamant.calculator;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculatorServiceTest {
	private static CalculatorService service;
	private static AnnotationConfigApplicationContext context;
	
	@BeforeClass
	public static void setup() {
		context = new AnnotationConfigApplicationContext();
		context.register(BeanConfiguration.class, CalculatorClient.class);
		context.refresh();
		service = context.getBean(CalculatorService.class);
	}
	
	@AfterClass
	public static void tearDown() {
		service = null;
		context = null;
	}
	
	
	@Test
	public void testAddition() {
		int p1 = 23, p2 = 22;
		try {
			assertTrue(service.addition(p1, p2) == 45);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testSubtraction() {
		int p1 = 20, p2 = 12;
		try {
			assertTrue(service.subtraction(p1, p2) == 8);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	@Test
	public void testMultiply() {
		int p1 = 20, p2 = 5;
		try {
			assertTrue(service.multiply(p1, p2) == 100);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	@Test
	public void testDivide() {
		int p1 = 25, p2 = 2;
		try {
			assertTrue(service.divide(p1, p2) == 12);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	@Test
	public void testModulus() {
		int p1 = 27, p2 = 10;
		try {
			assertTrue(service.modulus(p1, p2) == 7);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
