package test.Q5;

public class Person {
	String name; //��� ���� ����
	int money;	//�� ���� ����
	
	public Person(String name, int money) { //������� ����� ���� ��õǾ������Ƿ� �ΰ��� ����
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
		this.money -= 4000; //ī���� ���, �ֹ����� ������ �ٸ��Ƿ� takeCafe����  �ݾ� �Է��ϵ��� ��. 
	}
	public void takeBean(Bean bean) {
		bean.take(4500);
		this.money -= 4500;
	}
*/	
	public void showInfo() {
		System.out.println(name + "�� ���� ���� " + money + "�Դϴ�.");
	}


		
	}




