package ex;

public class Chapter4Q5 {
	public static void main(String[] args) {

		int size = 4;
		int i = 1;
		int j = 1;

		for (i = 1; i <= size; i++) { // 세로행 출력
			for (j = 1; j <= i + (size - 1); j++) { // (size-1)에서 -1을 지우고싶으면, 왼쪽 j<=i에서 =를 빼주면 됨.

				if (j <= size - i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}

			}
			System.out.println();
		}

		for (i = size - 1; i >= 1; i--) { 					// 세로행 줄여나가는거 출력
			for (j = 1; j <= size + i - 1; j++) { 			// 가로열 출력
				// j=시작점번호,
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
