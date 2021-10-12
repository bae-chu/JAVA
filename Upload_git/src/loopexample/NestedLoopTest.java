package loopexample;

public class NestedLoopTest {
	public static void main(String[] args) {

		for (int dan = 1; dan <= 9; dan++) {
			for (int times = 2; times <= 9; times++) {
				System.out.print(dan + " × " + times + " = " + dan * times + "\t"); //"\t" = tab 기능 
			}
			System.out.println( );
			}
	
}
}
/*
//출력기준으로, 구구단을 순서대로 세로 출력하고 싶은 경우, 
//for문의 dan이랑 times 위치만 바꾸어 주면됨. 

for (int times = 2; times <= 9; times++) {
	for (int dan = 1; dan <= 9; dan++) {
		System.out.print(dan + " × " + times + " = " + dan * times + "\t"); //"\t" = tab 기능 
	}
	System.out.println( );
	}

}
}
*/