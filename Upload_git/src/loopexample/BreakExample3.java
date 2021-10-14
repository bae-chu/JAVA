package loopexample;

public class BreakExample3 {
	public static void main(String[] args) {

		int sum = 0;
		int num;

		a: for (num = 1;; num++) {		//조건식 break 거는걸 원하는 위치로 지정 하고싶으면 책갈피 앞뒤로 하나씩 꽂아주면 됨
			sum += num;
			if (sum > 500)
				break a;				//책갈피이름은 맘대로여도 되고, 여기선 a로 달아줌. 
		}
		System.out.println(sum);
		System.out.println(num);
	}

}
