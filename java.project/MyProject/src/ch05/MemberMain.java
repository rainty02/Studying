package ch05;

public class MemberMain {

	public static void main(String[] args) {
		
		MemberVerTeacher member = new MemberVerTeacher("철수","010-1234-1234","컴공",3,"Gmail","2000-10-01","서울");
//		member.name = "영희"; - private 으로 접근이 제어됐기 때문에 접근 불가
		member.setName("영희");
		member.showInfo();
		System.out.println(member.getName());
	}

}
