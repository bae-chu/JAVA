package ifexample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfExampleTest {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("점수를 입력하세요 : ");
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
		
		System.out.println("성적은 " + score + "점 이고, 학점은" + grade + "입니다.");
		
	}
}


/*
 * 
 * int age = 30; //Integer.parseInt(); int charge;
 * 
 * if(age < 8) { charge = 1000; System.out.println("취학 전 아동입니다."); } else if(age
 * < 14) { charge = 2000; System.out.println("초등학생 입니다."); } else if(age < 20) {
 * charge = 2500; System.out.println("중, 고등학생입니다."); } else if(age > 59) {
 * charge = 0; System.out.println("경로우대입니다."); } else { charge = 3000;
 * System.out.println("일반인입니다.");
 */
