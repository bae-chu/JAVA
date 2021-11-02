package template;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	
	public void startCar(){
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	final public void run() { //보통은 하위클래스가 상속을 받을수있는데 final이 붙으면 더이상 불가
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
	}
}
