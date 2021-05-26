package ch07;

public class Female extends Person {
//	2. Person 클래스를 상속해서 확장하는 새로운 클래스 Male 클래스와 Female 클래스를 정의 해봅시다. 
//	① 각 클래스는 상속 받은 멤버 외에 추가적인 변수와 메소드를 추가해서 새로운 클래스를 정의해봅시다.
//	String name;
//	int perNo;	
	String job;
	
	public Female(String name, String perNo,String job) {
		super(name, perNo);
		this.job = job;	
	}		
	
	void hello() {
		System.out.println("안녕하세요");
	}
//	③ Person 클래스에서 정의된 인사하는 메소드를 오버라이딩 해봅시다.
	void introduce() {
		super.introduce();
		System.out.println("제 직업은  " + job +"입니다.");
	}
}