package ch02;

public class Person {

	String perName;	
	String perTel;
	String perNo;
	
	public static void main(String[] args) {
		
		Person per = new Person();
		per.perName = "Lee";
		per.perTel = "000-0000-0000";
		per.perNo = "000000-0000000";
		
		System.out.printf("이름 : %s\n전화번호 : %s\n주민등록번호 : %s",per.perName, per.perTel, per.perNo);
	}

}