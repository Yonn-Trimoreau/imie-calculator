package math;

import java.util.Scanner;

/**
 * Main class for UI
 * @author Yonn
 *
 */
public class Main {

	public static void main(String[] args) {
		Calcul calc = new Calcul();
		double result = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("❚█══█❚ THE SUPER CALCULATOR ❚█══█❚"+System.lineSeparator());
		
		Boolean correctEntry = false;
		do{
			System.out.print("Please enter an operator (+, -, /, *, sqrt) :");
			String operator = sc.nextLine();
			
			correctEntry = true;
			switch (operator) {
				case "+":
					double p1 = askNumber("first number", operator);
					double p2 = askNumber("second number", operator);
					result = calc.addition(p1,p2);
					break;
					
				case "-":
					double minuend = askNumber("minuend", operator);
					double subtrahend = askNumber("subtrahend", operator);
					result = calc.substraction(minuend, subtrahend);
					break;
					
				case "/":
					double dividend = askNumber("dividend", operator);
					double divisor = askNumber("divisor", operator);
					result = calc.division(dividend, divisor);
					break;
					
				case "*":
					double m1 = askNumber("first number", operator);
					double m2 = askNumber("second number", operator);
					result = calc.multiplication(m1, m2);
					break;
					
				case "sqrt":
					double n = askNumber("x", operator);
					result = calc.squareRoot(n);
					break;
	
				default:
					correctEntry = false;
					System.out.println("Please enter an operator");
					break;
			}
		}while(!correctEntry);
		
		System.out.println("The result of the operation is : "+result);
	}

	private static double askNumber(String nbName, String operator) {
		String numberStr;
		double number = 0;
		Scanner sc = new Scanner(System.in);
		
		Boolean correctEntry = false;
		do{
			System.out.print("Please enter the "+nbName+" of the operation "+operator+" :");
			numberStr = sc.nextLine();
			
			try{
				number = Double.parseDouble(numberStr);
				correctEntry = true;
			}
			catch(Exception e){
				correctEntry = false;
				System.out.println("Please enter a number");
			};
		}while(!correctEntry);
		
		return number;
	}

}
