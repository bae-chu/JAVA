package string;

public class StringTest2 {
	public static void main(String[] arags) {
		String javaStr = new String("java");
		String androidStr = new String("android");
		System.out.println(javaStr);
		System.out.println("ó�� ���ڿ� �ּ� �� : " + System.identityHashCode(javaStr));
		
		javaStr = javaStr.concat(androidStr); // javaStr = javaStr+adnroidStr �̰Ŷ� ������
		
		System.out.println(javaStr);
		System.out.println("����� ���ڿ� �ּ� �� : " + System.identityHashCode(javaStr));
	}
}
