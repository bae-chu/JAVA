package loopexample;

public class ForExampleTest {
	public static void main(String[] args) {
		/* 밑에꺼는 내가 작성한거. 
		int i;
		String t = "안녕하세요";
		for(i=1; i<=10; i++) {
		
			System.out.print(t+i+", ");
		}
		System.out.println("");

		*/
		
/*밑에꺼는 선생님 답안 1
		
			for(int i=1; i<=10; i++) {
			System.out.print("안녕하세요"+ i);
			if(i < 10) {
				System.out.print(", ");
			}
		}
		
		*/
//최종 답안
				
			for(int i=1; i<=10; i++) {
			System.out.print("안녕하세요"+ i + (i<10?", ":""));
		
			}
		}
	
	
}
