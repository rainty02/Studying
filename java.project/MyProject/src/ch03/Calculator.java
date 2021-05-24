package ch03;

import java.util.Scanner;

public class Calculator {
	
	void plus(int a, int b) {
		System.out.println(a+b);
	}
	void subtract(int a, int b) {
		System.out.println(a-b);
	}
	void multiply(int a, int b) {
		System.out.println(a*b);
	}
	void division(double a, double b) {
		System.out.println(a/b);
	}
	void pieR(double a) {
		System.out.println(2*Math.PI*a);
	}
	void pieRR(double a) {
		System.out.println(Math.PI*a*a);
	}
	
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		cal.plus(10, 10);
		cal.subtract(10, 10);
		cal.multiply(10, 10);
		cal.division(10, 10);
		cal.pieR(5.5);
		cal.pieRR(5.5);	
		
		System.out.print("1. 덧셈\n2. 뺄셈\n3. 곱셈\n4. 나눗셈\n5. 원의 둘레\n6. 원의둘레\n선택하시오 > ");
		
		int num1;
		int num2;
		double num3;
		Scanner sc = new Scanner(System.in);
		int menu = sc.nextInt();
		switch (menu) {
		case 1:
			System.out.print("첫번째 값을 입력하세요 > ");
			num1 = sc.nextInt();
			System.out.print("두번째 값을 입력하세요 > ");
			num2 = sc.nextInt();
			cal.plus(num1, num2);
			break;
		case 2:
			System.out.print("첫번째 값을 입력하세요 > ");
			num1 = sc.nextInt();
			System.out.print("두번째 값을 입력하세요 > ");
			num2 = sc.nextInt();
			cal.subtract(num1, num2);
			break;
		case 3:
			System.out.print("첫번째 값을 입력하세요 > ");
			num1 = sc.nextInt();
			System.out.print("두번째 값을 입력하세요 > ");
			num2 = sc.nextInt();
			cal.multiply(num1, num2);
			break;
		case 4:
			System.out.print("첫번째 값을 입력하세요 > ");
			num1 = sc.nextInt();
			System.out.print("두번째 값을 입력하세요 > ");
			num2 = sc.nextInt();
			cal.division(num1, num2);
			break;
		case 5:
			System.out.print("값을 입력하세요 > ");
			num3 = sc.nextDouble();
			cal.pieR(num3);
			break;
		case 6:
			System.out.print("첫번째 값을 입력하세요 > ");
			num3 = sc.nextDouble();
			cal.pieRR(num3);	
			break;
		}
	}
}
