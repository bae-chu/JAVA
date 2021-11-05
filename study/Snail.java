package algorithm;

public class Snail extends TwoDemension{

	public void solve(int size) {
		arr = new int[size][size];
		int num = 0;
		int i = 0; // 시작하는 행 위치
		int j = -1; // 배열 위치포인트 맞추기 위해 -1
		int s = 1;	//스위치 변수
		int k = arr.length; // 반복회수 size로 해도 됨.

		while (true) { // 무한반복 시키기위해 true 넣고, 나오는건 break
			for (int p = 0; p < k; p++) { // (int p = 1; p <= k; p++)
				num++;
				j = j + s; // j+=s;로 해도 됨.
				arr[i][j] = num;
			}
			
			k--;
			if (k == 0)
				break;

			for (int p = 0; p < k; p++) {
				num++;
				i = i + s;
				arr[i][j] = num;
			}
			s = s * -1;
		
//		for (int l = 0; l < arr.length; l++) {
//			for (int m = 0; m < arr[l].length; m++) {
//				System.out.print(arr[l][m] + "\t");
//			}
//			System.out.println("");
//			}
		}
	}
//
//	public static void main(String[] args) {
//		Snail sn = new Snail();
//		sn.snail(5);
//	}

	
}
