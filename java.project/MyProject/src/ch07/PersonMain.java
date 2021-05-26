package ch07;

public class PersonMain {

	public static void main(String[] args) {
		
		Male male = new Male("Lee", 2000, "검사");		
		Female female = new Female("Kim", 1990, "변호사");
		male.introduce();
		female.introduce();
	}
}