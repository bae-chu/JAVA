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
			throw new PasswordException("비번은 null일 수 없습니다.");
		}
		else if(pass.length()<6) {
			throw new PasswordException("비번은 6자 이상으로 입력하세요");
		}
		else if(pass.matches("[a-zA-Z]+")) {
			throw new PasswordException("비번은 영소문자 조합으로 만드세요");
		}
		this.pass = pass;
		}
	
	public static void main(String[] args) throws IOException{
		PasswordTest test = new PasswordTest();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
//		String pwd = "abcaaaaaaaaaaaa";
//		System.out.println("입력된 값 : " + pwd);
//		try {
//			test.setPass(pwd);
//		}catch (PasswordException e) {
//			System.out.println(e.getMessage());
//		}
		
		String pwd;
		while(true) {
			System.out.print("비번 입력 : ");
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
