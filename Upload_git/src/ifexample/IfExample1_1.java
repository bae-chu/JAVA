package ifexample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfExample1_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("성별을 입력하세요(남/여) : ");

		char gender = inbr.readLine().charAt(0);
		if (gender == '여') {
			System.out.println("여성입니다.");
		} else {
			System.out.println("남성입니다.");
		}
	}
}
