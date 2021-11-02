package ExQ5;

public class Sonata extends Car {
	public String CarName = "Sonata";
	@Override
	public void start() {
		System.out.println(CarName + " 시동을 켭니다.");
	}
	@Override
	public void drive() {
		System.out.println(CarName + " 달립니다.");
	}
	@Override
	public void stop() {
		System.out.println(CarName + " 멈춥니다.");
	}
	@Override
	public void turnoff() {
		System.out.println(CarName + " 시동을 끕니다.");
	}

}
