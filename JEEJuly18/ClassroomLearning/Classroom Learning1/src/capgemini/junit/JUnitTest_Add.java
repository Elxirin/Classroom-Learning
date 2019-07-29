package capgemini.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitTest_Add {

	@Test
	public void testAdd() {
		System.out.println("JUnit4_Test->testAdd...");
		Calculator calc = new Calculator();
		int actual = calc.add(10, 20);
		int expected = 31;
		assertEquals(expected, actual);
	}
	
}
