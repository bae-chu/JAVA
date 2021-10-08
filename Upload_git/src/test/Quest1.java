package test;

public class Quest1 {
	public static void main(String[] args) {
		
// 연습문제 : 변수 x, y에 각각 300을 할당. x를 42로 나누고 y를 38로 나누어 몫과 나머지를 구하고, 결과를 화면에 출력하는 프로그램을 작성 
		
		int x = 300; 
		int y = 300;
		int xx = 42;
		int yy = 38;
	
		
		System.out.println(x + "을 " + xx + "로 나눈 몫은 " + x/xx + "이고 나머지는 " + x%xx + "입니다." );
		System.out.println(y + "을 " + yy + "로 나눈 몫은 " + y/yy + "이고 나머지는 " + y%yy + "입니다." );
		//내가 작성한 답안
		
		
		System.out.println("300을 42로 나눈 몫은" + (x/42) + "이고 나머지는 " + (x%42) + "입니다.");
		// 위에껀 모범답안 
		// 변수 할당을 x, y만 했기때문에 내가 풀이한 것 처럼 xx yy 할 필요는 없음...
		
//System.out.println(x + "을 " + xx + "로 나눈 몫은 " + (int)(x/xx) + "이고 나머지는 " + (int)(x%xx) + "입니다." );
		
	}

}

/*
int a = 10;
double b = 2.0;
		
System.out.println((int)(a+b));
System.out.println((int)(a-b));
System.out.println((int)(a*b));
System.out.println((int)(a/b));

System.out.println(a+"+"+b+"="+(int)(a+b));
System.out.println(a+"-"+b+"="+(int)(a-b));
System.out.println(a+"*"+b+"="+(int)(a*b));
System.out.println(a+"/"+b+"="+(int)(a/b));
*/