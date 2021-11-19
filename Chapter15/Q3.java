package example;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Q3 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("a.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		
		osw.write("지금까지 자바 정말 재미있게 공부했어요^^");
	
		osw.flush();
	}
}

/*
public class Q3 {
	public static void main(String[] args) {
		try(FileWriter fw = new FileWriter("a.txt")){
			fw.write("지금까지 자바 정말 재미있게 공부했어요 ^^");
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력완료");
	}
}

*/