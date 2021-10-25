package test.Q5;

public class Bean {
	String beanNum; //카페 점포명
	int orderCount; //고객 카운터
	int money;		// 수입 
	
	public Bean(String beanNum) {
		this.beanNum=beanNum;
	}
	public void take(int money) {
		this.money += money;
		orderCount++;
	}
	public void showInfo() {
		System.out.println("콩다방" + beanNum + "의 손님은 " + orderCount + "명이고, 수입은 " + money + "입니다.");
	}
}

