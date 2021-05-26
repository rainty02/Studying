package ch06;

public class Student {

	private String stuName;
	private int korScore;
	private int engScore;
	private int mathScore;
		
	Student(String stuName, int korScore, int engScore, int mathScore){
		this.stuName = stuName;
		this.korScore = korScore;
		this.engScore = engScore;
		this.mathScore = mathScore;
	}
	
	public String getStuName() {
		return stuName;
	}
	public int getKorScore() {
		return korScore;
	}
	public int getEngScore() {
		return engScore;
	}
	public int getMathScore() {
		return mathScore;
	}	
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}
	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	
	String result() {
		int sum = korScore+engScore+mathScore;
		return stuName + "의 총점은 " + sum + ", 평균은 " + (sum/3.0) + "입니다.";
	}

	public static void main(String[] args) {
		
		Student[] stu = new Student[10];
		Student stu2 = new Student("Lee", 95, 94, 90);
		System.out.println(stu2.result());
		
		for(int inx = 0; inx <= 3; inx++) {
			System.out.println(stu[inx]);
		}		
	}
}
