package Chapter3;

import java.io.*;

public class OperationEx4 {
	public static void main(String[] args) throws IOException {

		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("�ƹ��� ���̸� �Է��ϼ���  : ");
		int fatherAge = Integer.parseInt(inbr.readLine());

		System.out.print("��Ӵ� ���̸� �Է��ϼ��� : ");
		int motherAge= Integer.parseInt(inbr.readLine());
		
		char ch;
		ch = (fatherAge > motherAge) ? 'T' : 'F';

		System.out.print("�ƹ����� ��ӴϺ��� �����ΰ��� : "); 
		System.out.println(ch);
	

	}
}
