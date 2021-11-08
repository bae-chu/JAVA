package string;
import java.util.StringTokenizer;

public class StringTokenprog {
	public static void main(String[] args) {
		
		StringTokenizer str = new StringTokenizer("2008/02/15", "/");
		int count;
		
		count = str.countTokens();
		System.out.println("파싱할 문자열의 수는 총 : " + count + "개");
		
		while(str.hasMoreTokens()) {
			String strToken=str.nextToken();
			System.out.println(strToken);
			if(strToken.equals("2008")) {
				strToken=str.nextToken("2");
				System.out.println(strToken);
			}
		}
	}

}
