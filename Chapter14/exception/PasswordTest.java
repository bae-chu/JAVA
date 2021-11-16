package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PasswordTest {
	private String pass;
	
	public String getPass() {
		return pass;
	}

	public void setPass(String pass) throws PasswordException{
		if(pass == null) {
			throw new PasswordException("����� null�� �� �����ϴ�.");
		}
		else if(pass.length()<6) {
			throw new PasswordException("����� 6�� �̻����� �Է��ϼ���");
		}
		else if(pass.matches("[a-zA-Z]+")) {
			throw new PasswordException("����� ���ҹ��� �������� ���弼��");
		}
		this.pass = pass;
		}
	
	public static void main(String[] args) throws IOException{
		PasswordTest test = new PasswordTest();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
//		String pwd = "abcaaaaaaaaaaaa";
//		System.out.println("�Էµ� �� : " + pwd);
//		try {
//			test.setPass(pwd);
//		}catch (PasswordException e) {
//			System.out.println(e.getMessage());
//		}
		
		String pwd;
		while(true) {
			System.out.print("��� �Է� : ");
			pwd = br.readLine();
			
			try {
				test.setPass(pwd);
				break;
			} catch(PasswordException e) {
				System.out.println(e.getMessage());
			}	
		
	}
	}
}
