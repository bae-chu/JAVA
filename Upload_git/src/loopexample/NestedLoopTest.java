package loopexample;

public class NestedLoopTest {
	public static void main(String[] args) {

		for (int dan = 1; dan <= 9; dan++) {
			for (int times = 2; times <= 9; times++) {
				System.out.print(dan + " �� " + times + " = " + dan * times + "\t"); //"\t" = tab ��� 
			}
			System.out.println( );
			}
	
}
}
/*
//��±�������, �������� ������� ���� ����ϰ� ���� ���, 
//for���� dan�̶� times ��ġ�� �ٲپ� �ָ��. 

for (int times = 2; times <= 9; times++) {
	for (int dan = 1; dan <= 9; dan++) {
		System.out.print(dan + " �� " + times + " = " + dan * times + "\t"); //"\t" = tab ��� 
	}
	System.out.println( );
	}

}
}
*/