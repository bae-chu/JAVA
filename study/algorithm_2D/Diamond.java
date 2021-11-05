package algorithm;

public class Diamond extends TwoDemension{
	
	public void solve(int size) {
		int num = 0;
		int s = size / 2;
		int e = size / 2;
		arr = new int[size][size]; // 여기까지 변수선언

		for (int i = 0; i < arr.length; i++) {	//행의 크기만큼 돌아간다, arr.length도 괜찮고, size로 넣어도 됨. 
			for (int j = s; j <= e; j++) { // s부터 e위치까지(<=). 시작값 s 부터, j의 최댓값이 e와 같거나 작거나.
				num++;
				arr[i][j] = num;
			}
			if (i < size / 2) {	//배열 i가 0부터 시작했으므로 size/2만 적음.
				s = s - 1; // s++ 로 적어도 됨. 
				e = e + 1; // e--로 적어도 됨. 
			} else {
				s = s + 1;	// s++ 로 적어도 됨. 
				e = e - 1;	// e--로 적어도 됨.
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