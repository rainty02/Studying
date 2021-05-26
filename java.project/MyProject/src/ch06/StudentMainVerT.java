package ch06;

public class StudentMainVerT {

	public static void main(String[] args) {
		
		StudentVerT[] students = new StudentVerT[10];
		
		students[0] = new StudentVerT("홍길동1", 100, 40, 20);
		students[1] = new StudentVerT("홍길동2", 91, 40, 20);
		students[2] = new StudentVerT("홍길동3", 81, 40, 20);
		students[3] = new StudentVerT("홍길동4", 71, 40, 20);
		students[4] = new StudentVerT("홍길동5", 81, 40, 20);
		students[5] = new StudentVerT("홍길동6", 91, 40, 20);
		students[6] = new StudentVerT("홍길동7", 71, 40, 20);
		students[7] = new StudentVerT("홍길동8", 61, 40, 20);
		students[8] = new StudentVerT("홍길동9", 51, 40, 20);
		students[9] = new StudentVerT("홍길동10", 50, 40, 20);

		System.out.println("이름 \t 국어 \t 영어 \t 수학 \t 총점 \t 평균");
		System.out.println("=================================================");
		for(int i=0; i<students.length; i++) {
			System.out.print(students[i].getName() +"\t");
			System.out.print(students[i].getKor() +"\t"+students[i].getEng() +"\t"+students[i].getMath() +"\t"+students[i].getSum() +"\t"+students[i].getAvg()+"\n");
		}
	}
}