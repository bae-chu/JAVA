package ifexample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfExample1_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("������ �Է��ϼ���(��/��) : ");

		char gender = inbr.readLine().charAt(0);
		if (gender == '��') {
			System.out.println("�����Դϴ�.");
		} else {
			System.out.println("�����Դϴ�.");
		}
	}
}
