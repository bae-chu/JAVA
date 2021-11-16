package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IDFormatTest {
	private String userID;
	
	public String getUserID() {
		return userID;
	}
	
	public void setUserID(String userID) throws IDFormatException {
		if(userID == null) {
			throw new IDFormatException("아이디는 null일 수 없습니다.");
		}
		else if(userID.length()<8 || userID.length()>20) {
			throw new IDFormatException("아이디는 8자 이상 20자 이하로 쓰세요.");
		}
		this.userID = userID;
	}
	
	public static void main(String[] args) throws IOException {
		IDFormatTest test = new IDFormatTest();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		String id;
		while(true) {
			System.out.print("아이디를 입력하세요 : ");
			id = br.readLine();
			
			try {
				test.setUserID(id);
				break;
			} catch (IDFormatException e) {
				System.out.println(e.getMessage());
			}
		}
				
		System.out.println("프로그램 종료");
}
}
//		String userID = null;
//		try {
//			test.setUserID(userID);
//		} catch(IDFormatException e) {
//			System.out.println(e.getMessage());
//		}
//		
//		userID = "12345";
//		try {
//			test.setUserID(userID);
//		} catch (IDFormatException e) {
//			System.out.println(e.getMessage());
//		}
//	}



