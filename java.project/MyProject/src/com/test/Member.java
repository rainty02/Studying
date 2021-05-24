package com.test;

class Calculator {
	int a, b;
	
	public int plus (int a, int b) {
		return a + b;				
	}
	public int subtract (int a, int b) {
		return a - b;				
	}
	public int multiply (int a, int b) {
		return a * b;				
	}
	public double division (int a, int b) {
		return (double)a / (double)b;				
	}	
}

public class Member {

	public static void main(String[] args) {
		System.out.println("이름");
		
		Calculator calc = new Calculator();
		
		System.out.println(calc.plus(1,2));
		System.out.println(calc.subtract(1,2));
		System.out.println(calc.multiply(1,2));
		System.out.println(calc.division(1,2));		
		
		
	}

}
