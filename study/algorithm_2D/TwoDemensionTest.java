package algorithm;

import java.io.IOException;

public class TwoDemensionTest {
	public static void main(String[] args) throws IOException {
		System.out.println("풀이 할 2차원 방식을 선택하세요");
		System.out.println("M : 마방진");
		System.out.println("D : 다이아몬드");
		System.out.println("S : 달팽이");
		
		int ch = System.in.read();
		TwoDemension td = null; // = new 클래스명대신, 택할수잇게 null로 바꿈 
		
		if(ch == 'M' || ch =='m') {		
			td = new Mabangjin();
		}else if(ch == 'D' || ch =='d') {
			td = new Diamond();
		}else if(ch == 'S' || ch =='s') {
			td = new Snail();
		}else {
			System.out.println("지원하지 않는 형식입니다.");
		}
		
		td.solve(5);
		td.display();
	}
}
