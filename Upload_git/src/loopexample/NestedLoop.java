package loopexample;

public class NestedLoop {
	public static void main(String[] args) {
//������ �����
		for (int dan = 1; dan <= 8; dan++) {
			for (int times = 1; times <= 8; times++) {
				System.out.print(dan + " �� " + times + " = " + dan * times + "\t"); //"\t" = tab ��� 
			}
			
			System.out.println();
			
		}
	}
}
