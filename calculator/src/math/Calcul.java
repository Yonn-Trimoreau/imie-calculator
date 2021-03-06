package math;

/**
 * Class of calcul methods
 * @author Yonn
 *
 */
public class Calcul{
	
	/**
	 * Addition of two numbers
	 * @param a first number
	 * @param b second number
	 * @return result of addition
	 */
	public double addition(double a, double b){
		return a+b;
	}
	
	/**
	 * Substraction of two numbers
	 * @param a minuend number
	 * @param b subtrahend number
	 * @return result of substraction
	 */
	public double substraction(double a, double b){
		return a-b;
	}
	
	/**
	 * Division of two numbers
	 * @param a dividend number
	 * @param b divisor number
	 * @return result of division
	 */
	public double division(double a, double b){
		return a/b;
	}
	
	/**
	 * Multiplication of two numbers
	 * @param a first number
	 * @param b second number
	 * @return result of multiplication
	 */
	public double multiplication(double a, double b){
		return a*b;
	}
	
	/**
	 * Square root of a number
	 * @param a number
	 * @return
	 */
	public double squareRoot(double a){
		return Math.sqrt(a);
	}
	
	/**
	 * Power of a number by an exponent
	 * @param a number
	 * @param b exponent
	 * @return
	 */
	public double power(double a, double b){
		return Math.pow(a, b);
	}
}
