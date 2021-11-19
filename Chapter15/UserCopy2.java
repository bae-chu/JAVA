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
			while((i=fis.read()) != -1) {	// ���� ���� ������ ����
				fos.write(i);
			}
			} else {
				System.out.println("������ �°� �����ϼ���.");
				System.out.println("���� : UserCopy [����] [���]");
			}
			} catch (FileNotFoundException e) {
			e.printStackTrace();
			} catch (IOException e) {
			e.printStackTrace();
			}
		} 
}