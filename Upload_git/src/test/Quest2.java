package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quest2 {
 public static void main(String[] args) throws IOException {

//bufferedReadr Ŭ������ �̿��Ͽ� �̸�, �й�(string), ��������(int)�� ���ڿ��� �о�鿩
//������ ����� ���� ȭ�鿡 ����ϴ� ���α׷� �ۼ�.
	 
	 BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
	 
	 String name, stuNum;
	 int toefl;
	 
	 System.out.println("�̸�, �й�, ���� ������ �Է��ϼ���.");
	 
	 System.out.print("�̸� : ");
	 name = inbr.readLine();
	 
	 System.out.print("�й� : ");
	 stuNum = inbr.readLine();
	 
	 System.out.print("�������� : ");
	 toefl = Integer.parseInt(inbr.readLine());
	 
	 System.out.println("���� �̸��� " + name + "�Դϴ�.");
	 System.out.println("�й��� " + stuNum + "�Դϴ�.");
	 System.out.println("�׸��� ���������� " + toefl +"�� �Դϴ�.");
	 
	 	 
 }
}
