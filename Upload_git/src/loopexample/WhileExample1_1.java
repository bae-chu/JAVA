package loopexample;

public class WhileExample1_1 {
	public static void main(String[] args) {

		int num = 1;
		int sum = 0;

		while (num <= 50) {
			if (num % 2 == 0) { 	// ������ 2�ؼ� �������� 0�̸� ¦��.
				sum += num;
			}
			num++;
		}
		System.out.println("1���� 50���� ¦���� ����? : " + sum);
	}
}
