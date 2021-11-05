package algorithm;

public class Diamond extends TwoDemension{
	
	public void solve(int size) {
		int num = 0;
		int s = size / 2;
		int e = size / 2;
		arr = new int[size][size]; // ������� ��������

		for (int i = 0; i < arr.length; i++) {	//���� ũ�⸸ŭ ���ư���, arr.length�� ������, size�� �־ ��. 
			for (int j = s; j <= e; j++) { // s���� e��ġ����(<=). ���۰� s ����, j�� �ִ��� e�� ���ų� �۰ų�.
				num++;
				arr[i][j] = num;
			}
			if (i < size / 2) {	//�迭 i�� 0���� ���������Ƿ� size/2�� ����.
				s = s - 1; // s++ �� ��� ��. 
				e = e + 1; // e--�� ��� ��. 
			} else {
				s = s + 1;	// s++ �� ��� ��. 
				e = e - 1;	// e--�� ��� ��.
			}
		}
		
	}
	@Override
	public void display() {
	
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i][j] != 0) {
					System.out.print(arr[i][j]+"\t");
				}
				else {
					System.out.print("\t");
				}
			}
			System.out.println("");
		}
	}
	
	}