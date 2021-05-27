package ex;

//	생성자 초기화의 순서
//	super는 조상의클래스의 생성자부터 초기화되고
//	상속된 순서대로 초기화된다


public class Car {
	int gasolinegauge;
	
	Car(int gg) {
		this.gasolinegauge = gg;
	}
}

class HybridCar extends Car {
	int electronicGauge;	
	
	HybridCar(int gg, int eg) {
		super(gg);
		this.electronicGauge = eg;
	}
	
	HybridCar(int gg) {
		super(gg);
	}
}

class HybridWaterCar extends HybridCar {

	int waterGauge;
	
	HybridWaterCar(int gg, int eg, int wg) {
		super(gg, eg);
		waterGauge = wg;
	}
	HybridWaterCar(int gg, int eg) {
		super(gg, eg);
	}
	HybridWaterCar(int gg) {
		super(gg);
	}	
	
	public void showCurrentGauge() {
		System.out.println("잔여 가솔린 :  " + gasolinegauge);
		System.out.println("잔여 가솔린 :  " + electronicGauge);
		System.out.println("잔여 가솔린 :  " + waterGauge);
	}
}