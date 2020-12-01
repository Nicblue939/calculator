package calcpakage;
import java.lang.Math;

public class MagicCalc {
	
	

	public static void main(String[] args) {

		sqrt(90);
		sin(67);
		cosine(33);
		tangent(11);
		factorial(12);
	}	
	private static void sqrt(int num1) {	
	System.out.println(Math.sqrt(num1));
	}
		
		
	private static void sin (int num1) {
		System.out.println(Math.sin(num1));
		
	}	
	private static void cosine(int num1) {
		System.out.println(Math.cos(num1));
		
	}
	
	private static void tangent(int num1) {
		System.out.println(Math.tan(num1));
		
	}
	
	private static void factorial (int num1) {
		
		int number = num1;
		long fact = 1;
		
		for(int i = 1; i<= number; i++) {
			fact = fact*i;
		}
		System.out.println(fact);
		
		
	}

	}

