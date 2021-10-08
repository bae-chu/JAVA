package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 키보드로부터 원의 반지름을 정수로 입력받음. 
 * 원의 원주(2ㅠr)를 구하고
 * 반지름과 원주를 출력하는 프로그램을 작성.
 * 변수 총 3개 : 버퍼리더변수, 반지름변수, ㅠ상수함수
 * [처리조건]
 * 1. 파이는 double형 상수로 저장함.
 * 2. 원주공식은 2ㅠr (r은 반지름)
 */
public class Quest3 {
	public static void main(String[] args) throws IOException { 
		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
		
		// double r, PI = 3.14159;  <- 이건 내가 적었던 답안
		
		int r;
		final double PI = 3.14159; 
		// 위가 정답. 문제에서 파이는 double형 "상수"로 저장한다 했으므로 final을 꼭 붙여야함. 
		
		
		System.out.print("반지름을 입력하세요 :");
		r = Integer.parseInt(inbr.readLine()); 
	
		System.out.println("반지름은 " + r + "이고, 원주는 " + (double)(PI*r*2) + "입니다.");
				
	}
	


}
