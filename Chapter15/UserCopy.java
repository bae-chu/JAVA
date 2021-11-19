package example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class UserCopy {
	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream(args[0]);
			fos = new FileOutputStream(args[1]);
		} catch (IOException e) {
			System.out.println(e);
			}	
		try { 
			fis.close();
			fos.close();
		}  catch (IOException e) {
			System.out.println(e);
			}
	
	} 

	}
// 문제 : 명령프롬프트 창에서 java UserCopy copy.txt copycopy.txt 입력시 
// copy가 copycopy 복사하도록 코딩할 것. 
