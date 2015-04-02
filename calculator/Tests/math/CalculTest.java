package math;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculTest {
	
	@Test
	public void testAddition() {
		Calcul calc = new Calcul();
		
		double result = calc.addition(1.5d,3.2d);
		
		assertEquals(4.7, result, 0.1);
	}
	
	@Test
	public void testSoustraction(){
		Calcul calc = new Calcul();
		
		double result = calc.substraction(3.2d, 1.2d);
		
		assertEquals(2.0,result,0.1);
	}
	
	@Test
	public void testDivision(){
		Calcul calc = new Calcul();
		
		double result = calc.division(10, 4);
		
		assertEquals(2.5, result, 0.1);
	}

}
