package algorithm;

import java.io.IOException;

public class TwoDemensionTest {
	public static void main(String[] args) throws IOException {
		System.out.println("Ǯ�� �� 2���� ����� �����ϼ���");
		System.out.println("M : ������");
		System.out.println("D : ���̾Ƹ��");
		System.out.println("S : ������");
		
		int ch = System.in.read();
		TwoDemension td = null; // = new Ŭ��������, ���Ҽ��հ� null�� �ٲ� 
		
		if(ch == 'M' || ch =='m') {		
			td = new Mabangjin();
		}else if(ch == 'D' || ch =='d') {
			td = new Diamond();
		}else if(ch == 'S' || ch =='s') {
			td = new Snail();
		}else {
			System.out.println("�������� �ʴ� �����Դϴ�.");
		}
		
		td.solve(5);
		td.display();
	}
}
