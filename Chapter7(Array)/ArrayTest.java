package array;

public class ArrayTest {
	public static void main(String[] args) {
		int[] num = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum=0;
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
//			System.out.println(num[i]);
//			System.out.println(num[5]); 이케쓰면 특정 위치 숫자 꺼낼 수 있음
			System.out.println("배열의 합 :" + 
sum);
		}

	}

}
