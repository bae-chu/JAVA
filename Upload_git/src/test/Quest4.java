package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* ���忡�� ������ ���ϰ��� ������.
 * ��ǰ ����, ������(%)�� Ű����κ��� �Է��� �޾Ƽ� 
 * ���԰����� ���� ����ϴ� ���α׷� �����.
 * [����׸�] ��ǰ����-����, ������(%)-�Ǽ�, ���ϰ���-�Ǽ�)
 */
public class Quest4 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
		
		int Pri;
		double dis;
		
		System.out.print("��ǰ�� ������ �Է��ϼ��� : ");
		Pri = Integer.parseInt(inbr.readLine());
		
		System.out.print("������(%)�� �Է��ϼ��� : ");
		dis = Double.parseDouble(inbr.readLine());
		
		//������ ��꺯�� �����ص� ������.
		//double sale = pri - (pri * dis/100)); 
		//�׸��� println�� sale �ֱ�.
		
		System.out.println(); //�� �� ���� ��
		System.out.println("��ǰ���� : " + Pri + " ��");
		System.out.println("������(%) : " + dis);
		System.out.println("���ϰ��� : " + (Pri-(Pri*dis/100)));
		//System.out.println("���ϰ��� : " + (int)(Pri-(Pri*dis/100)));
		//���ϰ��� ��� �� �Ҽ��� �����ֱ� ������ (int) �ٿ��� ���������� ����ϸ� ��. 
		

	}

}
