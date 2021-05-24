package test;

public class Test2 {

	String name;
	String tel;
	String major;
	int grade;
	String email;
	String birth;
	String address;
	
	Test2(String name, String tel, String major, int grade, String email, String birth, String address) {
		this.name = name;
		this.tel = tel;
		this.major = major;
		this.grade = grade;
		this.email = email;
		this.birth = birth;
		this.address = address;
	}
	Test2(String name, String tel, String major, int grade, String email) {
		this.name = name;
		this.tel = tel;
		this.major = major;
		this.grade = grade;
		this.email = email;
	}
	@Override
	public String toString() {
		return "이름: " + name + ", " +
				"전화번호: " + tel +  ", " +
				"전공: " + major +  ", " +
				"학년: " + grade +  ", " +
				"이메일: " + email +  ", " +
				"생년월일: " + birth +  ", " +
				"주소 " + address;
	}	
	
	public static void main(String[] args) {
		Test2 t1 = new Test2("Lee", "010-1234-1234", "computer science", 2, "lee@gmail.com", "000000", "seoul");
		Test2 t2 = new Test2("Lee", "010-1234-1234", "computer science", 2, "lee@gmail.com");
		
		System.out.println(t1);
		System.out.println(t2);
//		t1.print("Lee", "010-1234-1234", "computer science", 2, "lee@gmail.com", "000000", "seoul");
//		t2.print("Lee", "010-1234-1234", "computer science", 2, "lee@gmail.com");
	}

}
