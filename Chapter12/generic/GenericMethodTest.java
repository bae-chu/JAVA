package generics;

public class GenericMethodTest {
	public <T, V> void testMethod(T t, V v) {
		System.out.println(t);
		System.out.println(v);
	}
	public static void main(String[] args) {
		GenericMethodTest test = new GenericMethodTest();
		
		test.testMethod("ȫ�浿", 0.0);
	}

	}

