package ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chapter4Q1_1 { // operator 값이 사칙연산인 경우, 사칙연산을 수행하는 프로그램을 if-else랑 switch-case 두가지로 만듦.
	public static void main(String[] args) throws IOException {
		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
	
		int num1 = 10;
		int num2 = 2;
		int sum = 0;
		char operator = '+';
		boolean flag = true;
		while(true) {
			System.out.print("연산자를 입력하세요(0:종료) : ");
			operator = inbr.readLine().trim().charAt(0);
		
			if(operator=='0') {
			System.out.print("프로그램을 종료합니다.");
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
			System.out.println("잘못된 연산자입니다.");
		}
		if(flag) {
			System.out.println(num1 + String.valueOf(operator) + num2 + "=" + (sum));
		}
		
		
		flag = true; // 위에 플래그가 한번 있었기때문에 다른 구문(switch 같은) 실행시키기 전에, 플래그 초기화 시켜주는 용으로 써 주는것이 좋다.  
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
			System.out.println("잘못된 연산자입니다.");
	}
	
		if(flag) {
		System.out.println(num1 + String.valueOf(operator) + num2 + "=" + (sum));
		}
		}
	}
}
