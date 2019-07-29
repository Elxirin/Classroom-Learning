package com.capgemini.junit.maven;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitTest_Sub {

	@Test
	public void testSub() {
		System.out.println("JUnitTest->testSub...");
		Calculator calc = new Calculator();
		int actual = calc.sub(10, 2);
		int expected = 8;
		assertEquals(expected, actual);
	}
	
}
