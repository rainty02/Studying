package ch07;

public class PersonMain {

	public static void main(String[] args) {
		
		Male male = new Male("Lee", "870124-1111111", "검사");		
		Female female = new Female("Kim", "000202-2222222", "변호사");
		male.introduce();
		female.introduce();		
	}
}