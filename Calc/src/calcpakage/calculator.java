package calcpakage;
import java.util.*;
import java.lang.Math;

public class calculator {
	

	public static void main(String[] args) {
		
		int num1=0;
		int num2=0;
		char operator;
		double answer = 0.0;

	Scanner scanObject = new Scanner(System .in);

	System.out.println("Enter 1st number:");
	num1 = scanObject.nextInt(); 
	System.out.println("Enter 2nd number:");
	num2 = scanObject.nextInt();
	System.out.println("Operation?:");
	operator = scanObject.next().charAt(0);
	
		switch (operator) {
			case '+': answer = num1 + num2;
				break;
			case '-': answer = num1 - num2;
				break;
			case '*': answer = num1 * num2;
				break;
			case '/': answer = num1 / num2;
				break;
			case '|': answer = num1 * num1;
				break;
		}
		System.out.println(num1+""+operator+""+num2+"="+answer);
	}

}
