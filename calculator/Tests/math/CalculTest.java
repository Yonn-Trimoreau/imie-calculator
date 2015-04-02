package math;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculTest {
	
	@Test
	public void testAddition() {
		Calcul calc = new Calcul();
		
		double result = calc.addition(1.5d,3.2d);
		
		assertEquals(4.7, result, 0.001);
	}
	
	@Test
	public void testSoustraction(){
		Calcul calc = new Calcul();
		
		double result = calc.substraction(3.2d, 1.2d);
		
		assertEquals(2.0,result,0.001);
	}

}
