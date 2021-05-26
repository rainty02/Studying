package ch07;

import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {

//		Male male = new Male("Lee", "900101-1111111", "검사");
//		Female female = new Female("Kim", "000101-2222222", "변호사");
//		male.introduce();
//		female.introduce();

		Scanner sc = new Scanner(System.in);
		
		System.out.println("새로운 데이터를 생성합니다.");	
		System.out.print("이름을 입력하세요 > ");
		String name = sc.nextLine();
		System.out.print("주민등록번호(-포함)를 입력하세요 > ");
		String perNo = sc.nextLine();
		boolean run = true;
		while (run) {
			if (perNo.charAt(6) != '-') {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
			run = false;
		}
		System.out.print("직업을 입력하세요 > ");
		String job = sc.nextLine();
		switch (perNo.charAt(7)) {
		case '1':
			Male male = new Male(name, perNo, job);
			male.introduce();
			break;
		case '2':
			Female female = new Female(name, perNo, job);
			female.introduce();
			break;
		}
	}
}