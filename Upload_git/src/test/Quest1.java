package test;

public class Quest1 {
	public static void main(String[] args) {
		
// �������� : ���� x, y�� ���� 300�� �Ҵ�. x�� 42�� ������ y�� 38�� ������ ��� �������� ���ϰ�, ����� ȭ�鿡 ����ϴ� ���α׷��� �ۼ� 
		
		int x = 300; 
		int y = 300;
		int xx = 42;
		int yy = 38;
	
		
		System.out.println(x + "�� " + xx + "�� ���� ���� " + x/xx + "�̰� �������� " + x%xx + "�Դϴ�." );
		System.out.println(y + "�� " + yy + "�� ���� ���� " + y/yy + "�̰� �������� " + y%yy + "�Դϴ�." );
		//���� �ۼ��� ���
		
		
		System.out.println("300�� 42�� ���� ����" + (x/42) + "�̰� �������� " + (x%42) + "�Դϴ�.");
		// ������ ������ 
		// ���� �Ҵ��� x, y�� �߱⶧���� ���� Ǯ���� �� ó�� xx yy �� �ʿ�� ����...
		
//System.out.println(x + "�� " + xx + "�� ���� ���� " + (int)(x/xx) + "�̰� �������� " + (int)(x%xx) + "�Դϴ�." );
		
	}

}

/*
int a = 10;
double b = 2.0;
		
System.out.println((int)(a+b));
System.out.println((int)(a-b));
System.out.println((int)(a*b));
System.out.println((int)(a/b));

System.out.println(a+"+"+b+"="+(int)(a+b));
System.out.println(a+"-"+b+"="+(int)(a-b));
System.out.println(a+"*"+b+"="+(int)(a*b));
System.out.println(a+"/"+b+"="+(int)(a/b));
*/