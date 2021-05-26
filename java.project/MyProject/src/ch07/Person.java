package ch07;

import java.util.Calendar;

public class Person {

//	1. Person 이라는 클래스를 정의해봅시다. 
//	① 이름을 저장하는 변수, 주민등록번호를 저장하는 변수를 정의해봅시다.
	String name;
	String perNo;
	
	Person() {}
	Person(String name, String perNo){
		this.name = name;
		this.perNo = perNo;
	}	
	
//	② 인사하는 메소드를 정의해봅시다.	
//	- “안녕하세요. 저는 OOO입니다. 00살 입니다.”라는 문자열이 출력하도록 정의합시다
	void introduce() {
		System.out.println("안녕하세요. 저는 " + this.name + "입니다. " + getAge() + "살입니다.");
	}	
	int getAge() {
		int year = Integer.parseInt(this.perNo.substring(0,2));
		if (year >= 0 && year <= 21 ) {
			year += 2000;
		} else {
			year += 1900;
		}
		return Calendar.getInstance().get(Calendar.YEAR) - year - 1;		
	}
}