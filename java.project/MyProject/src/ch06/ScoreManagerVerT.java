package ch06;

public class ScoreManagerVerT {

	public static void main(String[] args) {
		
		int[] korScore = new int[10];
		int[] engScore = new int[10];
		int[] mathScore = new int[10];
		
		korScore[0] = 100;
		korScore[1] = 90;
		korScore[2] = 80;
		korScore[3] = 70;
		korScore[4] = 60;
		korScore[5] = 90;
		korScore[6] = 80;
		korScore[7] = 70;
		korScore[8] = 90;
		korScore[9] = 80;
		
		for(int idx=0; idx<korScore.length; idx++) {
			System.out.println(korScore[idx]);
		}
		int sum = 0;
		for(int i=0; i<korScore.length; i++) {
			sum += korScore[i];
		}
		System.out.println("국어 점수의 합 : " + sum);
		float avg = (float)sum / korScore.length;
		System.out.println("국어 점수의 평균은 : " + avg);
		
		
		
		
		
		
	}

}
