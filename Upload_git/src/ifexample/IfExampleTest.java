package ifexample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfExampleTest {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("������ �Է��ϼ��� : ");
		int score = Integer.parseInt(inbr.readLine());
		char grade;
		
		if (score >= 90) {
			grade = 'A'; 
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		System.out.println("������ " + score + "�� �̰�, ������" + grade + "�Դϴ�.");
		
	}
}


/*
 * 
 * int age = 30; //Integer.parseInt(); int charge;
 * 
 * if(age < 8) { charge = 1000; System.out.println("���� �� �Ƶ��Դϴ�."); } else if(age
 * < 14) { charge = 2000; System.out.println("�ʵ��л� �Դϴ�."); } else if(age < 20) {
 * charge = 2500; System.out.println("��, ����л��Դϴ�."); } else if(age > 59) {
 * charge = 0; System.out.println("��ο���Դϴ�."); } else { charge = 3000;
 * System.out.println("�Ϲ����Դϴ�.");
 */
