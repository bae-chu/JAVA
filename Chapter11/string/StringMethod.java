package string;

public class StringMethod {
	public static void main(String[] args) {
		int alength, blength;
		char achar, bchar;
		
		String mystr1 = new String("java powerful"); //��ĭ�� ���� ���� �����
		String mystr2 = new String("java programming");
		String mystr3 = mystr1 + mystr2;
		String mystr4 = "java powerful";
		
		alength = mystr1.length(); //length �迭ó�� ��ȣ�ȿ� �� ����� ��������� �θ��°� �ƴ϶� �޼���� ȣ���ϴ°�.
		blength = mystr2.length();
		achar = mystr1.charAt(5);
		bchar = mystr2.charAt(10);
		
		System.out.println("mystr1�� ����Ǿ��ִ� " + mystr1 + "�� ������ ���̴� " + alength);
		System.out.println("mystr2�� ����Ǿ��ִ� " + mystr2 + "�� ������ ���̴� " + blength);
		System.out.println("mystr1�� 5��° �ε����� �ִ� ���ڴ� " + achar);
		System.out.println("mystr2�� 10��° �ε����� �ִ� ���ڴ� " + bchar);
		System.out.println("mystr1�� ����� ���ڸ� �빮�ڷ� �ٲ� : " + mystr1.toUpperCase());
		System.out.println("mystr2�� ����� ���� �� a�� A�� �ٲ� : " + mystr2.replace('a', 'A'));
		System.out.println("mystr1�� ����� ���ڿ��� mystr4�� ����� ���ڿ��� ���� ��(��ҹ��� ����) : " + mystr1.equals(mystr4));
		System.out.println("mystr1�� ����� ���ڿ��� mystr4�� ����� ���ڿ��� ���� ��(��ҹ��� ���� �� ��) : " + mystr1.equalsIgnoreCase(mystr4));
		System.out.println("concat()�޼ҵ带 ����Ͽ� mystr1�� mystr2 ���̱� : " + mystr1.concat(mystr2));
		System.out.println("mystr1�� ù���ں��� 4���� ��� : " + mystr1.substring(0,3));
		System.out.println("mystr1�� 6��° ���ں��� ������ ���(powerful) : " + mystr1.substring(5));
		System.out.println("mystr1�� �� ���� ������ 'a'�� ��ġ : " + mystr1.indexOf('a'));
		System.out.println("mystr1�� �� ���߿� ������ 'a'�� ��ġ : " + mystr1.lastIndexOf('a'));
		System.out.println("mystr1�� 5�� ���ں��� �������� ���� : " + mystr1.substring(4).length());
		System.out.println("mystr1�� 5�� ���ں��� �������� ���� trim()��� : " + mystr1.substring(4).trim().length());
							
							
		
	}

}
