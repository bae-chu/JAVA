package test;

public class MyDateTest {
	public static void main(String[] args) {
	
	MyDate date1 = new MyDate(30,13,2000);
	if(date1.isValid()) {
		System.out.println("��ȿ�� ��¥�Դϴ�.");
	} else {
		System.out.println("��ȿ���� ���� ��¥�Դϴ�.");
	}
	
	MyDate date2 = new MyDate (2,10,2000);
	if(date2.isValid()) {
		System.out.println("��ȿ�� ��¥�Դϴ�.");
	} else {
		System.out.println("��ȿ���� ���� ��¥�Դϴ�.");
		}
	}
}
	
	

