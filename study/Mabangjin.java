package mabangjin;

public class Mabangjin {
	public void mabang(int size) {

		int i = 0; // 행 위치
		int j = size / 2; // 열 위치
		int[][] arr = new int[size][size]; // 배열선언

		for (int num = 1; num <= size * size; num++) { // num은 1부터 시작하고, num은 1부터 마방진 size까지 가야함.
			arr[i][j] = num;
			if (num % size == 0) { // num이 배수인지 아닌지 부터 확인
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
		for (int l = 0; l < arr.length; l++) {	 // 출력용 i 위치
			for (int m = 0; m < arr[l].length; m++) { 	// 출력용 j 위치
				System.out.print(arr[l][m] + "\t");
				}
		System.out.println("");//줄바꿈
	}
	}

	public static void main(String[] args) {
		Mabangjin m = new Mabangjin(); // 출력을 하려면 객체를 생성시켜야 함. m 이라는 객체 생성
		m.mabang(5);
	}	

}

