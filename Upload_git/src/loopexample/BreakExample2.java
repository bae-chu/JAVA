package loopexample;

public class BreakExample2 {
	public static void main(String[] args) {

		int sum = 0;
		int num = 0;

		for (num = 0; ; num++) { //가운데 조건식 생략하는 대신 break문 사용
			sum += num;
			if (sum >= 100)		//sum이 100보다 크거나 같을때
				break;			//중단
		}
		System.out.println("num : " + num);
		System.out.println("sum : " + sum);
	}

}
