package ch06;

public class StudentMain {

	public static void main(String[] args) {
		
		Student[] stu = new Student[10];
		
		stu[0] = new Student("1번", 95, 90, 85);
		stu[1] = new Student("2번", 90, 80, 84);
		stu[2] = new Student("3번", 91, 90, 80);
		stu[3] = new Student("4번", 92, 80, 86);
		stu[4] = new Student("5번", 93, 90, 88);
		stu[5] = new Student("6번", 94, 80, 91);
		stu[6] = new Student("7번", 95, 90, 82);
		stu[7] = new Student("8번", 96, 80, 98);
		stu[8] = new Student("9번", 97, 90, 91);
		stu[9] = new Student("10번", 98, 80, 95);
		
		for(int i = 0; i < stu.length; i++) {
			System.out.println(stu[i].result());
		}
		
		Student stu2 = new Student();
		stu2.setStuName("Lee");
		stu2.setKorScore(90);
		stu2.setEngScore(90);
		stu2.setMathScore(90);
		
		System.out.println(stu2.result());
		}		
}

