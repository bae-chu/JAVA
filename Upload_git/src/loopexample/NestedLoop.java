package loopexample;

public class NestedLoop {
	public static void main(String[] args) {
//구구단 만들기
		for (int dan = 1; dan <= 8; dan++) {
			for (int times = 1; times <= 8; times++) {
				System.out.print(dan + " × " + times + " = " + dan * times + "\t"); //"\t" = tab 기능 
			}
			
			System.out.println();
			
		}
	}
}
