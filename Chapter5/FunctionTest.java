package classpart;

public class FunctionTest {
	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;

		int sum1 = add(num1, num2);
		int sum2 = sub(num1, num2);
		int sum3 = gob(num1, num2);
		double
		sum4 = div(num1, num2);
		System.out.println(num1 + "+" + num2 + "=" + sum1 + "�Դϴ�.");
		System.out.println(num1 + "-" + num2 + "=" + sum2 + "�Դϴ�.");
		System.out.println(num1 + "��" + num2 + "=" + sum3 + "�Դϴ�.");
		System.out.println(num1 + "��" + num2 + "=" + sum4 + "�Դϴ�.");
		}

	public static int add(int n1, int n2) {
		int result = n1+n2;
		return result;
		//return n1+n2 ���� ����ó�� ������ �̷��� ��� ��
	}
	
	public static int sub(int n1, int n2) {
		int result = n1-n2;
		return result;
		
	}
	public static int gob(int n1, int n2) {
		int result = n1*n2;
		return result;
		
	}
	public static double div(int n1, int n2) {
		double result = (double)n1/n2;
		return result;
		
	}
}
