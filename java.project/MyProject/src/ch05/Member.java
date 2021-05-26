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
		this.grade = grade;
		this.email = email;
		this.birthday = birthday;
		this.address = address;
	}
	Member (String name, String tel, String major, int grade,String email){
		this.name = name;
		this.tel = tel;
		this.major = major;
		this.grade = grade;
		this.email = email;
	}	
	void memberInfo() {
		System.out.println("이름: " + name);
		System.out.println("전화번호: " + tel);
		System.out.println("전공: " + major);
		System.out.println("학년: " + grade);
		System.out.println("이메일: " + email);
		// 분기점 추가
		if(this.birthday != null) {
		System.out.println("생일: " + birthday);
		} else {
			System.out.println("생일: 입력된 값이 없습니다.");
		}
		if(this.address != null) {
		System.out.println("주소: " + address);
		} else {
			System.out.println("주소: 입력된 값이 없습니다.");
		}
	}

	public static void main(String[] args) {
		
		Member member = new Member("Lee", "010-0000-0000", "Computer Science", 1, "lee@gmail.com", "100101", "Seoul");
		Member member2 = new Member("Lee", "010-0000-0000", "Computer Science", 1, "lee@gmail.com");
		
		member.memberInfo();
		member2.memberInfo();
	}
}