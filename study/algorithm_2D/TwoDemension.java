package algorithm;

public abstract class TwoDemension implements Display{	//추상클래스로 만듦
	int[][] arr;
	abstract public void solve(int size);//추상메소드 하나 추가
	
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
