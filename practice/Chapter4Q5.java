package ex;

public class Chapter4Q5 {
	public static void main(String[] args) {

		int size = 4;
		int i = 1;
		int j = 1;

		for (i = 1; i <= size; i++) { // ������ ���
			for (j = 1; j <= i + (size - 1); j++) { // (size-1)���� -1�� ����������, ���� j<=i���� =�� ���ָ� ��.

				if (j <= size - i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}

			}
			System.out.println();
		}

		for (i = size - 1; i >= 1; i--) { 					// ������ �ٿ������°� ���
			for (j = 1; j <= size + i - 1; j++) { 			// ���ο� ���
				// j=��������ȣ,
				if (size - i >= j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();

		}
	}
}
