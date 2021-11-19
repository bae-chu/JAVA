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
