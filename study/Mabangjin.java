package mabangjin;

public class Mabangjin {
	public void mabang(int size) {

		int i = 0; // �� ��ġ
		int j = size / 2; // �� ��ġ
		int[][] arr = new int[size][size]; // �迭����

		for (int num = 1; num <= size * size; num++) { // num�� 1���� �����ϰ�, num�� 1���� ������ size���� ������.
			arr[i][j] = num;
			if (num % size == 0) { // num�� ������� �ƴ��� ���� Ȯ��
				i = i + 1;
			} else {
				i = i - 1;
				j = j + 1;
				if (i < 0) {
					i = size - 1;
				}
				if (j == size) {
					j = 0;
				}
			}
		}
		for (int l = 0; l < arr.length; l++) {	 // ��¿� i ��ġ
			for (int m = 0; m < arr[l].length; m++) { 	// ��¿� j ��ġ
				System.out.print(arr[l][m] + "\t");
				}
		System.out.println("");//�ٹٲ�
	}
	}

	public static void main(String[] args) {
		Mabangjin m = new Mabangjin(); // ����� �Ϸ��� ��ü�� �������Ѿ� ��. m �̶�� ��ü ����
		m.mabang(5);
	}	

}

