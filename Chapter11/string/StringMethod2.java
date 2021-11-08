package string;

public class StringMethod2 {
	public static void main(String[] args) {
		String str1 = "java programming is powerful";
		String arr1[] = str1.split(" ");
		System.out.println(str1);
		System.out.println("split 메서드 사용 : ");
		for(int i = 0; i<arr1.length; i++) {
			System.out.println("배열 [" + i + "] 번째 값 : " + arr1[i]);
		}
			System.out.println();
			
		String str2 = "2020-06-17";
		String arr2[] = str2.split("-");
		System.out.println(str2);
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i] + "\t");
		}
	}
	

}
