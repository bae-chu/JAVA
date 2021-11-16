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
			throw new IDFormatException("���̵�� null�� �� �����ϴ�.");
		}
		else if(userID.length()<8 || userID.length()>20) {
			throw new IDFormatException("���̵�� 8�� �̻� 20�� ���Ϸ� ������.");
		}
		this.userID = userID;
	}
	
	public static void main(String[] args) throws IOException {
		IDFormatTest test = new IDFormatTest();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		String id;
		while(true) {
			System.out.print("���̵� �Է��ϼ��� : ");
			id = br.readLine();
			
			try {
				test.setUserID(id);
				break;
			} catch (IDFormatException e) {
				System.out.println(e.getMessage());
			}
		}
				
		System.out.println("���α׷� ����");
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



