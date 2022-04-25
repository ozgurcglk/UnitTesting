package com.atmosware.testdemo.businessTests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.atmosware.testdemo.business.concretes.MathManager;

public class MathManagerTests {
	
	MathManager mathManager;
	
	@BeforeEach
	public void setup() {
		mathManager = new MathManager();
	}

	//baska katmanlara bagliliklar geldiginde mocking yapicaz
	@Test
	public void one_plus_seven_is_eight() {
		//arrange -- given
			MathManager mathManager = new MathManager();
			int number1 = 1;
			int number2 = 7;
			int expected = 8;
		//act -- when
			int actual = mathManager.add(number1, number2);
			
		//assert -- then
			Assertions.assertEquals(expected, actual);
			
	}
	
	@Test
	public void minus_one_plus_seven_is_six() {
		//arrange -- given
			MathManager mathManager = new MathManager();
			int number1 = -1;
			int number2 = 7;
			int expected = 6;
		//act -- when
			int actual = mathManager.add(number1, number2);
			
		//assert -- then
			Assertions.assertEquals(expected, actual);
			
	}
	
	@ParameterizedTest
	@ValueSource(ints= {2,5,8})
	public void mutiply_with_zero_should_return_zero(int sourceItem) {
		int number1= 0;
		int number2 = sourceItem;
		int expected = 0;
		
		int actual = mathManager.multiply(number1, number2);
		
		assertEquals(expected, actual);
		
	}
	
}
