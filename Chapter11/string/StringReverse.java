package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringReverse {
	public static void main(String[] args) throws IOException {
		System.out.println("���ڿ��� �Է��ϼ���");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader inbr = new BufferedReader(isr);
		String instr = inbr.readLine();
		StringReverse sr = new StringReverse();
						
		System.out.println("�Է��� ���ڿ� : " + instr);
		System.out.println("�Ųٷ� �ٲ� ���ڿ� : " + sr.reverse(instr));
		}

	private String reverse(String instr) {
//		String str = "";
//		for(int i=instr.length()-1; i>=0; i--) {	// for�� ���
//			str += instr.charAt(i);
//			}

//		StringBuilder str = new StringBuilder("");
//		for(int i=instr.length()-1; i>=0; i--) {
//			str.append(instr.charAt(i));
//		}
		
		StringBuilder str = new StringBuilder(instr);	//�̰� StringBuilder�� �ִ� ������ �޼ҵ�
		System.out.println(str.reverse());
		return str.toString();
	}
}

//java �������ϸ� avaj �� ��µǰ� �ؾ� ��. 
//���� ���� -1...  for���Ἥ.. ��ü ���̿��� 0�� �ɶ�����..