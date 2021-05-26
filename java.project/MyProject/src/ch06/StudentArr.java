package ch06;

public class StudentArr {

	public static void main(String[] args) {
		
		int[][] score = {
						{91, 93, 94, 90, 79, 95, 95, 90, 90, 79},
						{90, 97, 80, 94, 79, 90, 95, 90, 90, 79},
						{95, 90, 93, 85, 79, 97, 91, 94, 90, 79}
						};
		
		for(int i = 0; i < score.length; i++) {			
			int sum = 0;
			for(int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + ". ");
				sum += score[i][j];
			}
			System.out.println("평균점수 : " + (sum/10.0));
		}
	}
}