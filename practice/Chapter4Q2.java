package ex;

public class Chapter4Q2 { // Q2. 구구단을 짝수단만 출력하도록 만들어보기.
	public static void main(String[] args) {

		for (int i = 2; i <= 9; i++) {
			if (i % 2 == 1)
				continue; 	//위치상 continue를 요기 나뚜는게 더 나음. 
			for (int j = 1; j <= 9; j++) {
									//요 위치에 continue를 놔뚜면 뒷자리 계산할필요없는데 이거까지 일을 하기 때문. 
					System.out.print(i + "×" + j + "=" + (i * j) + "\t");
			}
			System.out.println();
		}
		System.out.println();

	}
}
