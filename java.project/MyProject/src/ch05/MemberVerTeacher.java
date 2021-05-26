package ch05;

public class MemberVerTeacher {

//	1.Member 클래스에는 아래 요구사항에 맞는 변수와 메소드를 정의하고,
//	main()메소드 에 해당 메소드를 호출해서 결과를 확인해보세요.
//	단 인스턴스의 생성은 생성자를 이용해서 초기화하는 코드를 작성해 봅시다.
//	생성자 - 초기화 메소드, 인스턴스를 생성할 때 단 한번, 인스턴스 변수를 초기화함
//	
//	①아래의 데이터를 저장 이름, 전화번호, 전공, 학년, email, 생일, 주소
//	데이터를 저장 - 변수를 이용해서 메모리에 저장
	private String name; // 클래스 영역에서 정의 - 인스턴스 변수, 인스턴스가 생성될 때 변수의 메모리공간이 생성됨. 초기화를 생략가능.
	private final String phoneNumber; // 참조형 변수의 기본 값 - null
	private String major;
	private int grade;
	private String email;
	private String birthday; // 2020-10-10
	private String address;
	
//	접근제어 지시자 private을 쓰는 이유
//	클래스 내부의 멤버들만 참조가 가능 : 정보 은닉, 변수의 데이터를 보호
	
	
//	③모든 정보를 저장하도록 하는 생성자와 생일과 주소는 저장하지 않을 수 있는 생성자를 정의
//	생성자의 요구사항 - 생성자 오버로딩
//	오버로딩 - 이름이 같은 메소드 정의
//	생성자의 이름 (매개변수) {초기화코드}
//	생성자의 이름 = 클래스 이름
//	생성자는 필요할 경우 반드시 하나이상 있어야한다.
	MemberVerTeacher(String name, String phoneNumber, String major, int grade, String email, String birthday, String address){
//		name = name; 어느 변수를 가르키는지 알 수 없음
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.major = major;
		this.grade = grade;
		this.email = email;
		this.birthday = birthday;
		this.address = address;
	}	
//	오버로딩의 조건
//	1. 메소드의 이름은 같음
//	2. 매개변수의 개수가 틀리거나, 매개변수의 타입이 달라애 오버로딩이 성립
	
	MemberVerTeacher(String name, String phoneNumber, String major, int grade, String email){
//		this.name = name;
//		this.phoneNumber = phoneNumber;
//		this.major = major;
//		this.grade = grade;
//		this.email = email;
		this(name, phoneNumber, major, grade, email, null, null);
//		위에 생성된 생성자를 호출해서 사용. 갯수가 다른 경우 디폴트 값을 넣음.
//		장점 - 여러 생성자를 만들 경우. 유지보수가 필요할 경우.
	}	
	
	MemberVerTeacher(String name, String phoneNumber, String major){
//		this.name = name;
//		this.phoneNumber = phoneNumber;
//		this.major = major;
		this(name, phoneNumber, major, 0, null, null, null);
	}	
	MemberVerTeacher() {
		this.phoneNumber = "010-0000-0000"; // final 상수는 생성자에서 초기화함.
	}
	
//	②위에서 정의한 정보를 출력하는 메소드 정의
//	기능 - 메소드
	void showInfo() {
		System.out.println("이름 : " + this.name); // 자신의 참조값을 가지는 참조변수
		System.out.println("전화번호 : " + phoneNumber);
		System.out.println("전공 : " + major);
		System.out.println("학년 : " + grade);
		System.out.println("이메일 : " + email);
		if(this.birthday == null) {
			System.out.println("생일 : 입력된 데이터가 없습니다.");
		} else {
		System.out.println("생년월일 : " + birthday);
		}
		if(this.address != null) {
			System.out.println("주소 : " + address); 
		} else {
		System.out.println("주소 : 입력된 데이터가 없습니다.");
		}
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
//	④main() 메소드에서 두 가지 생성자를 이용해서 인스턴스 생성하고 출력 메소드를 통해 저장된 데이터 출력
	
	public static void main(String[] args) {
		
//		MemberVerTeacher member = new MemberVerTeacher(); // 순서1. 메모리에 올림, 순서2. 생성자 호출. - 생성자 매개변수가 없기 때문에 오류
		MemberVerTeacher member1 = new MemberVerTeacher("철수","010-1234-1234","컴공",3,"Gmail","2000-10-01","서울");
		member1.name = "영희";
		member1.showInfo();
//		member1.phoneNumber = "000"; 불가
		
		MemberVerTeacher member2 = new MemberVerTeacher("철수","010-1234-1234","컴공",3,"Gmail");
		member2.showInfo();
	}
}