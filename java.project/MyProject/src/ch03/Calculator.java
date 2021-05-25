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
	double division(double a, double b) {
		return a / b;
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
		double db2;		
		
		System.out.println("1. 덧셈");
		System.out.println("2. 뺄셈");
		System.out.println("3. 곱셈");
		System.out.println("4. 나눗셈");
		System.out.println("5. 원의 둘레");
		System.out.println("6. 원의 넓이");
		System.out.print("메뉴를 선택하세요 > ");
		int menu = sc.nextInt();
		
		switch (menu) {
			case 1:
				System.out.print("첫번째 값를 입력하세요 > ");
				num1 = sc.nextInt();
				System.out.print("두번째 값을 입력하세요 > ");
				num2 = sc.nextInt();
				System.out.println(cal2.plus(num1, num2));
				break;
			case 2:
				System.out.print("첫번째 값를 입력하세요 > ");
				num1 = sc.nextInt();
				System.out.print("두번째 값을 입력하세요 > ");
				num2 = sc.nextInt();
				System.out.println(cal2.subtract(num1, num2));
				break;
			case 3:
				System.out.print("첫번째 값를 입력하세요 > ");
				num1 = sc.nextInt();
				System.out.print("두번째 값을 입력하세요 > ");
				num2 = sc.nextInt();
				System.out.println(cal2.multiply(num1, num2));
				break;			
			case 4:
				System.out.print("첫번째 값를 입력하세요 > ");
				db1 = sc.nextDouble();
				System.out.print("두번째 값을 입력하세요 > ");
				db2 = sc.nextDouble();
				System.out.println(cal2.division(db1, db2));
				break;
			case 5:
				System.out.print("첫번째 값를 입력하세요 > ");
				db1 = sc.nextDouble();
				System.out.println(cal2.pieR(db1));
				break;
			case 6:
				System.out.print("첫번째 값를 입력하세요 > ");
				db1 = sc.nextDouble();
				System.out.println(cal2.pieRR(db1));
				break;	
			default:
				System.out.println("잘못 눌렀습니다.");
		}
	}
}