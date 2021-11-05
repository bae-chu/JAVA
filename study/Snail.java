package algorithm;

public class Snail extends TwoDemension{

	public void solve(int size) {
		arr = new int[size][size];
		int num = 0;
		int i = 0; // �����ϴ� �� ��ġ
		int j = -1; // �迭 ��ġ����Ʈ ���߱� ���� -1
		int s = 1;	//����ġ ����
		int k = arr.length; // �ݺ�ȸ�� size�� �ص� ��.

		while (true) { // ���ѹݺ� ��Ű������ true �ְ�, �����°� break
			for (int p = 0; p < k; p++) { // (int p = 1; p <= k; p++)
				num++;
				j = j + s; // j+=s;�� �ص� ��.
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
