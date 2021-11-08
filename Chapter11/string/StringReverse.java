package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringReverse {
	public static void main(String[] args) throws IOException {
		System.out.println("문자열을 입력하세요");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader inbr = new BufferedReader(isr);
		String instr = inbr.readLine();
		StringReverse sr = new StringReverse();
						
		System.out.println("입력한 문자열 : " + instr);
		System.out.println("거꾸로 바뀐 문자열 : " + sr.reverse(instr));
		}

	private String reverse(String instr) {
//		String str = "";
//		for(int i=instr.length()-1; i>=0; i--) {	// for문 사용
//			str += instr.charAt(i);
//			}

//		StringBuilder str = new StringBuilder("");
//		for(int i=instr.length()-1; i>=0; i--) {
//			str.append(instr.charAt(i));
//		}
		
		StringBuilder str = new StringBuilder(instr);	//이건 StringBuilder에 있는 리버스 메소드
		System.out.println(str.reverse());
		return str.toString();
	}
}

//java 리버스하면 avaj 로 출력되게 해야 함. 
//문자 길이 -1...  for문써서.. 전체 길이에서 0이 될때까지..