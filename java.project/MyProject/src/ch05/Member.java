package ch05;

public class Member {

	String name;
	String tel;
	String major;
	int grade;
	String email;
	String birthday;
	String address;
	
	Member (String name, String tel, String major, int grade, String email, String birthday, String address){
		this.name = name;
		this.tel = tel;
		this.major = major;
		this. grade = grade;
		this.email = email;
		this.birthday = birthday;
		this.address = address;
	}
	Member (String name, String tel, String major, int grade,String email){
		this.name = name;
		this.tel = tel;
		this.major = major;
		this. grade = grade;
		this.email = email;
	}	
	void memberInfo() {
		System.out.println("이름: " + name + "\n" +
							"전화번호: " + tel +  "\n" +
							"전공: " + major +  "\n" +
							"학년: " + grade +  "\n" +
							"이메일: " + email +  "\n" +
							"생년월일: " + birthday +  "\n" +
							"주소: " + address);
	}

	public static void main(String[] args) {
		
		Member member = new Member("Lee", "010-0000-0000", "Computer Science", 1, "lee@gmail.com", "100101", "Seoul");
		Member member2 = new Member("Lee", "010-0000-0000", "Computer Science", 1, "lee@gmail.com");
		
		member.memberInfo();
		member2.memberInfo();
	}
}