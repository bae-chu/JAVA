package loopexample;

public class WhileExample1 {
	public static void main(String[] args) {
	
		int num = 1;
		int sum = 0;
		
		while(num <= 10) { 
			sum += num;
			num++;
		}
		System.out.println("1���� 10������ ���� " + sum + "�Դϴ�.");
		
		//while�� (num < 10)���� ���� �� ���
		int num2 = 0;
		int sum2 = 0;
		
		while(num2 < 10) { 
			num2++;
			sum2 += num2;
			
		}
		System.out.println("1���� 10������ ���� " + sum2 + "�Դϴ�.");
		
		}
	}
