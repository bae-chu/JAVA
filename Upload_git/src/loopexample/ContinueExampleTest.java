package loopexample;

public class ContinueExampleTest {
	public static void main(String[] args) {

		for (int num = 3; num <= 100; num++) {
			if (num % 3 != 0)
				continue; //num을 3으로 나눠서 나머지가 0이 되지않으면 출력하지않고 continue 빠꾸해서 다시 for로 돌아감. 
//			if(num%3==0) System.out.println(num); << continue를 안쓸경우 이렇게 써도 됨. 
			System.out.println(num);
		}
	
	}
}
