package ch06;

public class StudentArr {
	
	void result(int[] name) {
		int sum = 0;	
		for(int idx = 0; idx < name.length; idx++) {
			System.out.print(name[idx] + " ");
			sum += name[idx];
		}
		System.out.println();
		float avg = sum / 10f;
		if (name.hashCode() == 2018699554) {
			System.out.println("국어점수의 총점은 " + sum + "점, 평균점수는 " + avg + "점입니다.");
		} else if (name.hashCode() == 1311053135) {
			System.out.println("영어점수의 총점은 " + sum + "점, 평균점수는 " + avg + "점입니다.");
		} else if (name.hashCode() == 118352462) {
			System.out.println("영어점수의 총점은 " + sum + "점, 평균점수는 " + avg + "점입니다.");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		int[] kor = {91, 93, 94, 90, 79, 95, 95, 90, 90, 79};
		int[] eng = {90, 97, 80, 94, 79, 90, 95, 90, 90, 79};				
		int[] math = {95, 90, 93, 85, 79, 97, 91, 94, 90, 79};
		StudentArr kor1 = new StudentArr();
		kor1.result(kor);
		kor1.result(eng);
		kor1.result(math);
	}	
}