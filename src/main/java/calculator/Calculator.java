package calculator;

public class Calculator {

	public static void main(String[] args){
	int a,b;
		
	System.out.println("20 + 6 = " + add(20,6));
		
	System.out.println("10 - 9 = " + subtract(10,9));

	System.out.println("6 * 7 = " + multiply(6,7));
		
	System.out.println("20 / 10 = " + divide(20,10));

	}

	public static int add(int a, int b) {
		return a + b;
	}

	public static int subtract(int a, int b) {
		return a - b;
	}
	
	public static int multiply(int a, int b) {
		return a*b;
	}

	public static double divide(int a, int b) {
		double result;
		if (b == 0) {
			throw new IllegalArgumentException("Divisor cannot divide by zero");
		} else {
			result = Double.valueOf(a)/Double.valueOf(b);
		}
		return result;
	}
	
	
}
