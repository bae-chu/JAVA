package test.Q5;

public class Star{
	
	String starNum;
	int orderCount;
	int money;
	
	public Star(String starNum) {
		this.starNum = starNum;
	}
	public void take(int money) {
		this.money += money;
		orderCount++;
	}
	
	public void showInfo() {
		System.out.println("���ٹ�" + starNum + "�� �մ��� " + orderCount + "�̰�, ������ " + money + "�Դϴ�.");
	}

}
