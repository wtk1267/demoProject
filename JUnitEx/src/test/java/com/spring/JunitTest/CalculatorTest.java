package com.spring.JunitTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void test() {
		Calculator c = new Calculator();
		
		double res = c.sum(10, 20);
		
		
		// 기대값(예상값), 결과값변수(실제값), 오차범위(허용오차) cf) 허요오차는 숫자도 되지만 시간도 가능
		assertEquals(30, res, 0);
		
		
	}//test end 
	
	
	
	
	
	
	
	
	
	
	
}//class end 
