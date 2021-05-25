package ch04;

import java.util.Scanner;
import java.util.Calendar;

public class MemberVerTeacher {

	void vaccinCheck(int birthYear) {
//		int age = 2021-birthYear-1; // 나이연산
		int age = ageCal(birthYear);
		
		boolean check1 = age<15 || age>=65;
		boolean check2 = !(age>=15 && age<65);
		// 범위를 한정짓기 어려울 경우,
		// 그 반대의 범위를 한정짓기 쉽다면 !연산을 사용하면 효과적
		
		System.out.println();
		
		if(check1) {
			System.out.println("무료예방접종이 가능합니다.");
		} else {
			System.out.println("무료예방접종 대상이 아닙니다.");
		}	
	}
	void checkup(int birthYear) {
		int age = ageCal(birthYear);
		boolean check1 = birthYear%2==0 && 2021%2==0 || birthYear%2==1 && 2021%2==1;
		boolean check2 = birthYear%2==2021%2;
		
		if(age>=20 && check2) {
			System.out.println("검진 대상");
			if(age>=40) {
				System.out.println("암검진 대상");
			}
		} else {
			System.out.println("검진 대상이 아닙니다.");
		}
	}
	
	// 태어난 연도를 입력하면 나이를 반환하는 메소드
	int ageCal(int year) {
		return Calendar.getInstance().get(Calendar.YEAR)-year-1;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("태어난 연도를 입력해주세요 > ");
		int birthYear = scanner.nextInt();
		
		MemberVerTeacher member = new MemberVerTeacher();
		member.vaccinCheck(birthYear);
		member.checkup(birthYear);
	}
}