package test.Q5;

public class Bean {
	String beanNum; //ī�� ������
	int orderCount; //�� ī����
	int money;		// ���� 
	
	public Bean(String beanNum) {
		this.beanNum=beanNum;
	}
	public void take(int money) {
		this.money += money;
		orderCount++;
	}
	public void showInfo() {
		System.out.println("��ٹ�" + beanNum + "�� �մ��� " + orderCount + "���̰�, ������ " + money + "�Դϴ�.");
	}
}

