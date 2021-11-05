package algorithm;

public abstract class TwoDemension implements Display{	//�߻�Ŭ������ ����
	int[][] arr;
	abstract public void solve(int size);//�߻�޼ҵ� �ϳ� �߰�
	
	@Override
	public void display() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println("");
			}
		}
}
