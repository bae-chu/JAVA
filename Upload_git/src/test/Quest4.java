package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 매장에서 물건을 세일가로 구입함.
 * 상품 가격, 할인율(%)을 키보드로부터 입력을 받아서 
 * 구입가격이 얼만지 계산하는 프로그램 만들기.
 * [출력항목] 상품가격-정수, 할인율(%)-실수, 세일가격-실수)
 */
public class Quest4 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
		
		int Pri;
		double dis;
		
		System.out.print("상품의 가격을 입력하세요 : ");
		Pri = Integer.parseInt(inbr.readLine());
		
		System.out.print("할인율(%)을 입력하세요 : ");
		dis = Double.parseDouble(inbr.readLine());
		
		//할인율 계산변수 선언해도 무방함.
		//double sale = pri - (pri * dis/100)); 
		//그리고 println에 sale 넣기.
		
		System.out.println(); //한 줄 띄우는 용
		System.out.println("상품가격 : " + Pri + " 원");
		System.out.println("할인율(%) : " + dis);
		System.out.println("세일가격 : " + (Pri-(Pri*dis/100)));
		//System.out.println("세일가격 : " + (int)(Pri-(Pri*dis/100)));
		//세일가격 출력 시 소숫점 보여주기 싫으면 (int) 붙여서 정수형으로 출력하면 됨. 
		

	}

}
