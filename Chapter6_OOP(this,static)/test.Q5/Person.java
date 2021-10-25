package test.Q5;

public class Person {
	String name; //사람 변수 지정
	int money;	//돈 변수 지정
	
	public Person(String name, int money) { //결과물에 사람과 돈이 명시되어있으므로 두가지 지정
		this.name = name;
		this.money = money;
	}
	
	public void takeStar(Star star, int money) {
		star.take(money);
		this.money -= money;		
	}	
	public void takeBean(Bean bean, int money) {
		bean.take(money);
		this.money -= money;
	}
/*	
	public void takeStar(Star star) {
		star.take(4000);
		this.money -= 4000; //카페의 경우, 주문마다 가격이 다르므로 takeCafe에서  금액 입력하도록 함. 
	}
	public void takeBean(Bean bean) {
		bean.take(4500);
		this.money -= 4500;
	}
*/	
	public void showInfo() {
		System.out.println(name + "의 남은 돈은 " + money + "입니다.");
	}


		
	}




