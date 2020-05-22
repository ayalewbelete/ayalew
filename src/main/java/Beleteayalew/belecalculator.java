package Beleteayalew;

import java.util.Scanner;

public class belecalculator {
	
	public static void main (String [] args) {
		
		double num1 , num2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number:");
		
		num1 = scanner.nextDouble();
		System.out.println("Enter second number:");
		
		num2 = scanner.nextDouble();
		
		System.out.println("enter an operator (+, -, *, /):");
		
		char operator = scanner.next().charAt(0);
		
		scanner.close();
		double output;
		
		switch(operator)
		{
		case'+':
			output= num1 + num2;
			break;
			
		case'-':
			output= num1 - num2;
			break;

		
		case'*':
			output= num1 * num2;
			break;

			
		case'/':
			output= num1 / num2;
		
	 default:
		 System.out.println("incorrect operator");
		 return;
 }
		 System.out.println(num1+ " "+ operator +" "+num2+ "="+ output);
	 
	}
}