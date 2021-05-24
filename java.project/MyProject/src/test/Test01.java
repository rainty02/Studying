package test;

public class Test01 {
	
	void free (int a) {
		if (a < 15 || 64 < a) {
			System.out.println("무료예방접종이 가능합니다.");
		} else {
			System.out.println("무료접종 대상이 아닙니다.");
		}	
	}
	void check (int a) {
		if (a > 19) {
			if ((a%2) == 0) {
				System.out.println("올해 건강검진 대상입니다.");
			} else {
				System.out.println("올해 검강검진 대상이 아닙니다.");
			}
		}
		if (a > 39) {
			System.out.println("암 검진 대상입니다.");
		}
	}
	
	public static void main(String[] args) {
		String name = "Lee";
		int age = 10;
		double height = 100.1;
		boolean hasBook = true;
		
		System.out.println("이름은 " + name + ", " + 
							"나이는 " + age + ", " + 
							"키는 " + height + ", " + 
							"책의 보유 여부 : " + hasBook);

		Test01 t = new Test01();
		t.free(20);
		System.out.println();
		t.free(21);
		System.out.println();
		t.check(29);
		System.out.println();
		t.check(40);
		
		
		
	}

}
