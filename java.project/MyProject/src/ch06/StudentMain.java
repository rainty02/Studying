package ch06;

public class StudentMain {

	public static void main(String[] args) {
		
		Student[] stu = new Student[10];
		stu[0] = new Student("Lee", 95, 90, 85);
		stu[1] = new Student("Kim", 90, 80, 84);
		stu[2] = new Student("Choi", 91, 90, 80);
		stu[3] = new Student("Son", 92, 80, 86);
		stu[4] = new Student("Park", 93, 90, 88);
		stu[5] = new Student("Ahn", 94, 80, 91);
		stu[6] = new Student("Jeong", 95, 90, 82);
		stu[7] = new Student("Song", 96, 80, 98);
		stu[8] = new Student("Jang", 97, 90, 91);
		stu[9] = new Student("Lim", 98, 80, 95);
		
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		for(int i = 0; i < stu.length; i++) {			
			System.out.println(	stu[i].getStuName() + "\t" +
								stu[i].getKorScore() + "\t" +
								stu[i].getEngScore() + "\t" +
								stu[i].getMathScore() + "\t" +
								stu[i].getSum() + "\t" +
								stu[i].getAvg());
		}
	}	
}