package finalex;

public class Constant {
	int num = 10;
	final int NUM = 100;
	
	public static void main(String[] args) {
		Constant cons = new Constant();
		cons.num=50;
		cons.NUM=30; // final 선언했는데 여기다가 숫자 넣어서 틀린거임 
		
		System.out.println(cons.num);
		System.out.println(cons.NUM);
	}

}
