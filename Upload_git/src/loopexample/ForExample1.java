package loopexample;

public class ForExample1 {
	public static void main(String[] args ) {
		
		int i;
		int sum;
		for(i=1, sum=0; i<=10; i++) {
			sum += i;
			}
		
		System.out.println("1부터 10까지의 합은 ? : " + sum);
	}
}
/*		
		
// 별도로 i 란 변수를 안쓸경우에는 아래와 같이 int 변수 선언을  for 문 안에서 하는게 일반적임. 
		int i; 
		int sum=0; // sum=0의 경우 변경되지 않는 고정값이므로, 이건 for문 바깥에서 초기선언 해주는게 일반적. 
		for(int i=1; i<=10; i++) {
			sum += i;
			}
		
		System.out.println("1부터 10까지의 합은 ? : " + sum);
		}
}
*/