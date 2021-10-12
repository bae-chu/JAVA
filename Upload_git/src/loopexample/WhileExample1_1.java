package loopexample;

public class WhileExample1_1 {
	public static void main(String[] args) {

		int num = 1;
		int sum = 0;

		while (num <= 50) {
			if (num % 2 == 0) { 	// 나누기 2해서 나머지가 0이면 짝수.
				sum += num;
			}
			num++;
		}
		System.out.println("1부터 50까지 짝수의 합은? : " + sum);
	}
}
