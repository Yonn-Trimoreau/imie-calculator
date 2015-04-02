package math;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculTest {
	
	private Calcul calc;
	
	@Before
	public void setUp(){
		this.calc = new Calcul();
		//No need to destroy this variable in tear down since Java has a GC
	}
	
	@Test
	public void testAddition() {
		double result = calc.addition(1.5d,3.2d);
		
		assertEquals(4.7, result, 0.1);
	}
	
	@Test
	public void testSoustraction(){
		double result = calc.substraction(3.2d, 1.2d);
		
		assertEquals(2.0,result,0.1);
	}
	
	@Test
	public void testDivision(){
		double result = calc.division(10, 4);
		
		assertEquals(2.5, result, 0.1);
	}
	
	@Test
	public void testMultiplication(){
		double result = calc.multiplication(7, 8);
		
		assertEquals(56, result, 1);
	}
	
	@Test
	public void testSquareRoot(){
		double result = calc.squareRoot(16);
		
		assertEquals(4, result, 1);
	}
	
	@Test
	public void testPower(){
		double result = calc.power(2, 2);
		
		assertEquals(4, result, 1);
	}
}
