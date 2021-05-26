package ch06;

public class StudentArr {
	
	void result(int[] name) {
		int sum = 0;
		System.out.println(name);
		System.out.print(name+"점수: ");
		for(int i = 0; i < name.length; i++) {
			sum += name[i];
			System.out.print(name[i] + " ");		
		} System.out.println("평균점수 : " + (sum)/10.0);
	}
	
	public static void main(String[] args) {
		
		int[] kor = {91, 93, 94, 90, 79, 95, 95, 90, 90, 79};
		int[] eng = {90, 97, 80, 94, 79, 90, 95, 90, 90, 79};				
		int[] math = {95, 90, 93, 85, 79, 97, 91, 94, 90, 79};
		
		for(int i = 0; i < kor.length; i++) {
			System.out.println(kor[i]);
		}
		
		StudentArr arr = new StudentArr();
		arr.result(kor);	
	}
	
}