package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Ű����κ��� ���� �������� ������ �Է¹���. 
 * ���� ����(2��r)�� ���ϰ�
 * �������� ���ָ� ����ϴ� ���α׷��� �ۼ�.
 * ���� �� 3�� : ���۸�������, ����������, �л���Լ�
 * [ó������]
 * 1. ���̴� double�� ����� ������.
 * 2. ���ְ����� 2��r (r�� ������)
 */
public class Quest3 {
	public static void main(String[] args) throws IOException { 
		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
		
		// double r, PI = 3.14159;  <- �̰� ���� ������ ���
		
		int r;
		final double PI = 3.14159; 
		// ���� ����. �������� ���̴� double�� "���"�� �����Ѵ� �����Ƿ� final�� �� �ٿ�����. 
		
		
		System.out.print("�������� �Է��ϼ��� :");
		r = Integer.parseInt(inbr.readLine()); 
	
		System.out.println("�������� " + r + "�̰�, ���ִ� " + (double)(PI*r*2) + "�Դϴ�.");
				
	}
	


}
