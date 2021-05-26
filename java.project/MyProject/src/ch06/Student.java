package ch06;

public class Student {

	private String stuName;
	private int korScore;
	private int engScore;
	private int mathScore;
		
	Student() {}
	
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
	
	int getSum() {
		return korScore + engScore + mathScore;
	}
	float getAvg() {
		return (korScore + engScore + mathScore) / 3f;
	}
}