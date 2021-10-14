package ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chapter4Q1_1 { // operator ���� ��Ģ������ ���, ��Ģ������ �����ϴ� ���α׷��� if-else�� switch-case �ΰ����� ����.
	public static void main(String[] args) throws IOException {
		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
	
		int num1 = 10;
		int num2 = 2;
		int sum = 0;
		char operator = '+';
		boolean flag = true;
		while(true) {
			System.out.print("�����ڸ� �Է��ϼ���(0:����) : ");
			operator = inbr.readLine().trim().charAt(0);
		
			if(operator=='0') {
			System.out.print("���α׷��� �����մϴ�.");
			break;
			}
				
		if (operator == '+') {
			sum = num1 + num2;
		} 
		else if (operator == '-') {
			sum = num1 - num2;
		}

		else if (operator == '/') {
			sum = num1 / num2;
		}

		else if (operator == '*') {
			sum = num1 * num2;
		}

		else {
			flag = false;
			System.out.println("�߸��� �������Դϴ�.");
		}
		if(flag) {
			System.out.println(num1 + String.valueOf(operator) + num2 + "=" + (sum));
		}
		
		
		flag = true; // ���� �÷��װ� �ѹ� �־��⶧���� �ٸ� ����(switch ����) �����Ű�� ����, �÷��� �ʱ�ȭ �����ִ� ������ �� �ִ°��� ����.  
		switch(operator) {
		case '+' : 
			sum = num1 + num2;
			break;
		case '-' : 
			sum = num1 - num2;
			break;
		case '/' :
			sum = num1 / num2;
			break;
		case '*' :
			sum = num1 * num2;
			break;
		
		default :
			flag = false;
			System.out.println("�߸��� �������Դϴ�.");
	}
	
		if(flag) {
		System.out.println(num1 + String.valueOf(operator) + num2 + "=" + (sum));
		}
		}
	}
}
