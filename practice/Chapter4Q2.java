package ex;

public class Chapter4Q2 { // Q2. �������� ¦���ܸ� ����ϵ��� ������.
	public static void main(String[] args) {

		for (int i = 2; i <= 9; i++) {
			if (i % 2 == 1)
				continue; 	//��ġ�� continue�� ��� ���Ѵ°� �� ����. 
			for (int j = 1; j <= 9; j++) {
									//�� ��ġ�� continue�� ���Ѹ� ���ڸ� ������ʿ���µ� �̰ű��� ���� �ϱ� ����. 
					System.out.print(i + "��" + j + "=" + (i * j) + "\t");
			}
			System.out.println();
		}
		System.out.println();

	}
}
