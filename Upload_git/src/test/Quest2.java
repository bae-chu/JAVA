package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quest2 {
 public static void main(String[] args) throws IOException {

//bufferedReadr 클래스를 이용하여 이름, 학번(string), 토플점수(int)를 문자열로 읽어들여
//다음과 결과와 같이 화면에 출력하는 프로그램 작성.
	 
	 BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
	 
	 String name, stuNum;
	 int toefl;
	 
	 System.out.println("이름, 학번, 토플 점수를 입력하세요.");
	 
	 System.out.print("이름 : ");
	 name = inbr.readLine();
	 
	 System.out.print("학번 : ");
	 stuNum = inbr.readLine();
	 
	 System.out.print("토플점수 : ");
	 toefl = Integer.parseInt(inbr.readLine());
	 
	 System.out.println("나의 이름은 " + name + "입니다.");
	 System.out.println("학번은 " + stuNum + "입니다.");
	 System.out.println("그리고 토플점수는 " + toefl +"점 입니다.");
	 
	 	 
 }
}
