package example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class UserCopy2 {
	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			if(args.length >= 2) {
		
			fis = new FileInputStream(args[0]);
			fos = new FileOutputStream(args[1]);
			
			int i;	
			while((i=fis.read()) != -1) {	// 파일 본문 내용을 복사
				fos.write(i);
			}
			} else {
				System.out.println("사용법에 맞게 실행하세요.");
				System.out.println("사용법 : UserCopy [원본] [대상]");
			}
			} catch (FileNotFoundException e) {
			e.printStackTrace();
			} catch (IOException e) {
			e.printStackTrace();
			}
		} 
}