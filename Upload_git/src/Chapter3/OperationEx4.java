package Chapter3;

import java.io.*;

public class OperationEx4 {
	public static void main(String[] args) throws IOException {

		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("아버지 나이를 입력하세요  : ");
		int fatherAge = Integer.parseInt(inbr.readLine());

		System.out.print("어머니 나이를 입력하세요 : ");
		int motherAge= Integer.parseInt(inbr.readLine());
		
		char ch;
		ch = (fatherAge > motherAge) ? 'T' : 'F';

		System.out.print("아버지가 어머니보다 연상인가요 : "); 
		System.out.println(ch);
	

	}
}
