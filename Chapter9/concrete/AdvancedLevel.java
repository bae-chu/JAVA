package gamelevel;

public class AdvancedLevel extends PlayerLevel {
	@Override
	public void run() {
		System.out.println("���� �޸��ϴ�.");
	}
	
	@Override
	public void jump() {
		System.out.println("���� ���� �մϴ�.");
	}
	
	@Override
	public void turn() {
		System.out.println("�� �� �� ������");
	}

	@Override
	public void showLevelMassage() {
		System.out.println("******�߱��� �����Դϴ�.******");
	}
}
