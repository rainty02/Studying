package ch06;

public class StudentMain {

	public static void main(String[] args) {
		
		Student[] stu = new Student[10];
		Student stu2 = new Student();
		stu2.setStuName("Lee");
		stu2.setKorScore(90);
		stu2.setEngScore(90);
		stu2.setMathScore(90);
		
		System.out.println(stu2.result());
		}		
}

