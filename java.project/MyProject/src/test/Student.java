package test;

import java.util.*;

public class Student {
	
	 String name;
	 int kor;
	 int eng;
	 int math;
	
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getKor() {
//		return kor;
//	}
//
//	public void setKor(int kor) {
//		this.kor = kor;
//	}
//
//	public int getEng() {
//		return eng;
//	}
//
//	public void setEng(int eng) {
//		this.eng = eng;
//	}
//
//	public int getMath() {
//		return math;
//	}
//
//	public void setMath(int math) {
//		this.math = math;
//	}

	Student() {}
	
	Student (String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	

	
	String result() {
		int sum = kor + eng + math;
		double ever = sum / 3.0;
		return name + "의 총점은 " + sum + ", 평균은 " + ever + "입니다.";
	}
	
	public static void main(String[] args) {

		Student[] stu = new Student[10];
//		Student[] stu2 = {"Lee", 90, 90, 90};
//		stu.n
		
	
		
	}

}
