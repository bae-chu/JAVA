package ex;

public class Chapter4Q4 {
	public static void main(String[] args) {

		int size = 4;
		int i = 1;
		int j = 1;

		for (i = 1; i <= size; i++) { // ������ ���
			for (j = 1; j <= i + (size - 1); j++) { // ���ο� ���

				if (j <= size - i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}

			}
			System.out.println();
		}
		
	}
}
