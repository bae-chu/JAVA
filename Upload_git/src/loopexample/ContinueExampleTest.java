package loopexample;

public class ContinueExampleTest {
	public static void main(String[] args) {

		for (int num = 3; num <= 100; num++) {
			if (num % 3 != 0)
				continue; //num�� 3���� ������ �������� 0�� ���������� ��������ʰ� continue �����ؼ� �ٽ� for�� ���ư�. 
//			if(num%3==0) System.out.println(num); << continue�� �Ⱦ���� �̷��� �ᵵ ��. 
			System.out.println(num);
		}
	
	}
}
