import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ServletTestCalculator {

	//Testing add method
	@Test (expected = NullPointerException.class)
	public void testing_Null_Number_addMethod() {
		CalculatorServlet cal = new CalculatorServlet();
		float num = (Float) null;
		
		float result = cal.addNumbers(num, 1);
	}
	
	@Test
	public void testing_positive_numbers_AddMethod() {
		CalculatorServlet cal = new CalculatorServlet();
		float result = cal.addNumbers(1, 1);
		
		assertEquals(2, result);
	}
	
	@Test
	public void testing_Zero_numbers_AddMethod() {
		CalculatorServlet cal = new CalculatorServlet();
		float result = cal.addNumbers(0, 0);
		
		assertEquals(0, result);
	}
	
	@Test
	public void testing_negative_numbers_AddMethod() {
		CalculatorServlet cal = new CalculatorServlet();
		float result = cal.addNumbers(-1, -1);
		
		assertEquals(-2, result);
	}
	
	@Test
	public void testing_negative_and_positive_numbers_AddMethod() {
		CalculatorServlet cal = new CalculatorServlet();
		float result = cal.addNumbers(1, -1);
		
		assertEquals(0, result);
	}
	
	
	//Testing subtract method

	@Test (expected = NullPointerException.class)
	public void testing_Null_Number_subtractMethod() {
		CalculatorServlet cal = new CalculatorServlet();
		float num = (Float) null;
		float result = cal.subtractNumbers(num, 1);
	}
	
	@Test
	public void testing_positive_numbers_subtractMethod() {
		CalculatorServlet cal = new CalculatorServlet();
		float result = cal.subtractNumbers(5, 1);	
		assertEquals(4, result);
	}
	
	@Test
	public void testing_negative_numbers_postive_result_subtractMethod() {
		CalculatorServlet cal = new CalculatorServlet();
		float result = cal.subtractNumbers(-1, -5);	
		assertEquals(4, result);
	}
	
	@Test
	public void testing_negative_numbers_negative_result_subtractMethod() {
		CalculatorServlet cal = new CalculatorServlet();
		float result = cal.subtractNumbers(-5, -1);	
		assertEquals(-4, result);
	}
	
	@Test
	public void testing_zero_numbers_subtractMethod() {
		CalculatorServlet cal = new CalculatorServlet();
		float result = cal.subtractNumbers(10, -0);	
		assertEquals(10, result);
	}
	
	
	//Testing multiply Method
	
	@Test (expected = NullPointerException.class)
	public void testing_Null_Number_multiplytMethod() {
		CalculatorServlet cal = new CalculatorServlet();
		float num = (Float) null;
		float result = cal.multiplyNumbers(num, 1);
	}
	
	@Test
	public void testing_zero_numbers_multiplyMethod() {
		CalculatorServlet cal = new CalculatorServlet();
		float result = cal.multiplyNumbers(10, 0);	
		assertEquals(0, result);
	}
	
	@Test
	public void testing_positive_numbers_multiplyMethod() {
		CalculatorServlet cal = new CalculatorServlet();
		float result = cal.multiplyNumbers(10, 5);	
		assertEquals(50, result);
	}
	
	@Test
	public void testing_negative_numbers_multiplyMethod() {
		CalculatorServlet cal = new CalculatorServlet();
		float result = cal.multiplyNumbers(-10, 5);	
		assertEquals(-50, result);
	}
	
	
	//Testing divide Method
	
	@Test (expected = NullPointerException.class)
	public void testing_Null_Number_dividetMethod() {
		CalculatorServlet cal = new CalculatorServlet();
		float num = (Float) null;
		float result = cal.divideNumbers(num, 1);
	}
	
	
	@Test
	public void testing_negative_numbers_divideMethod() {
		CalculatorServlet cal = new CalculatorServlet();
		float result = cal.divideNumbers(0, 5);	
		assertEquals(0, result);
	}
	
	
	@Test
	public void testing_positive_numbers_divideMethod() {
		CalculatorServlet cal = new CalculatorServlet();
		float result = cal.divideNumbers(5, 5);	
		assertEquals(1, result);
	}
}
