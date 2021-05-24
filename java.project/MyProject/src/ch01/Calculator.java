package ch01;

public class Calculator {
	
	void plus(int a, int b) {
		System.out.println(a+b);
	}
	void subtract(int a, int b) {
		System.out.println(a-b);
	}
	void multiply(long a, long b) {
		System.out.println(a*b);
	}
	void division(double a, double b) {
		System.out.println(a/b);
	}
	
	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		calc.plus(10, 10);
		calc.subtract(10, 10);
		calc.multiply(10, 10);
		calc.division(10, 10);
	}
}