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
		System.out.println("별다방" + starNum + "의 손님은 " + orderCount + "이고, 수입은 " + money + "입니다.");
	}

}
