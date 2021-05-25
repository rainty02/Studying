package ch04;

import java.util.Calendar;
import java.util.Scanner;

public class Member {
	
	Calendar cal = Calendar.getInstance();
	int year = cal.get(Calendar.YEAR);
	// 현재 연도 가져오기 
	
	void inoculation(int birth) {
		int result = year - birth;
		if( result < 15 || result >= 65) {
			System.out.println("무료예방접종이 가능합니다.");
		} else {
			System.out.println("무료예방접종 대상이 아닙니다.");
		}
	}
	void checkup(int birth) {
		if(birth >= 20) {
			if(birth%2 == 0) {
				System.out.println("짝수 해에 건강검진을 받을 수 있습니다.");
			} else {
				System.out.println("홀수 해에 건강검진을 받을 수 있습니다.");
			}
		}
		if(year-birth >= 40) {
			System.out.println("암검진 대상입니다.");
		}
	}	
	public static void main(String[] args) {
		
		Member mem = new Member();
		Scanner sc = new Scanner(System.in);

		System.out.print("태어난 연도을 입력해주세요  > ");
		int birth = sc.nextInt();
		mem.inoculation(birth);
		mem.checkup(birth);			
	}
}