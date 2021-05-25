package ch03;

import java.util.Scanner;

public class Calculator {

	int plus(int a, int b) {
		return a + b;
	}
	int subtract(int a, int b) {
		return a - b;
	}
	int multiply(int a, int b) {
		return a * b;
	}
	double division(int a, int b) {
		return (double)a / b;
	}
	double pieR(double a) {
		return 2 * Math.PI * a;
	}
	double pieRR(double a) {
		return Math.PI * a * a;
	}
	
	public static void main(String[] args) {
		
//		Calculator cal = new Calculator();
//		System.out.println(cal.plus(5, 5));
//		System.out.println(cal.subtract(5, 5));
//		System.out.println(cal.multiply(5, 5));
//		System.out.println(cal.division(5, 5));
//		System.out.println(cal.pieR(5.5));
//		System.out.println(cal.pieRR(5.5));

		Scanner sc = new Scanner(System.in);
		Calculator cal2 = new Calculator();
		int num1;
		int num2;
		double db1;
		
		System.out.print("첫번째 값를 입력하세요 > ");
		num1 = sc.nextInt();
		System.out.print("두번째 값을 입력하세요 > ");
		num2 = sc.nextInt();
		
		System.out.println(num1 + " + " +num2 + " = " + cal2.plus(num1, num2));
		System.out.println(num1 + " - " +num2 + " = " + cal2.subtract(num1, num2));
		System.out.println(num1 + " * " +num2 + " = " + cal2.multiply(num1, num2));
		System.out.println(num1 + " / " +num2 + " = " + cal2.division(num1, num2));
		
		System.out.print("반지름 값를 입력하세요 > ");
		db1 = sc.nextDouble();
		System.out.println("원의 둘레는 " + cal2.pieR(db1));
		System.out.println("원의 넓이는 " + cal2.pieRR(db1));
	}
}