package ch07;

public class PersonMain {

	public static void main(String[] args) {
		
		Male male = new Male("Lee", "900101-1111111", "검사");		
		Female female = new Female("Kim", "000101-2222222", "변호사");
		male.introduce();
		female.introduce();		
	}
}