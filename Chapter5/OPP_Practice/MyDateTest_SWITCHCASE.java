package test;

public class MyDateTest_SWITCHCASE {
	public static void main(String[] args) {
	
	MyDate_SWITCHCASE date1 = new MyDate_SWITCHCASE(30,13,2000);
	if(date1.isValid()) {
		System.out.println("��ȿ�� ��¥�Դϴ�.");
	} else {
		System.out.println("��ȿ���� ���� ��¥�Դϴ�.");
	}
	MyDate_SWITCHCASE date2 = new MyDate_SWITCHCASE(29,2,2024);
	if(date2.isValid()) {
		System.out.println("��ȿ�� ��¥�Դϴ�.");
	} else {
		System.out.println("��ȿ���� ���� ��¥�Դϴ�.");
	
	
	}
	}
}
	
	

