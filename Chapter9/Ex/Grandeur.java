package ExQ5;

public class Grandeur extends Car {
	
	public String CarName = "Grandeur";
	@Override
	public void start() {
		System.out.println(CarName + " �õ��� �մϴ�.");
	}
	@Override
	public void drive() {
		System.out.println(CarName + " �޸��ϴ�.");
	}
	@Override
	public void stop() {
		System.out.println(CarName + " ����ϴ�.");
	}
	@Override
	public void turnoff() {
		System.out.println(CarName + " �õ��� ���ϴ�.");
	}

}

