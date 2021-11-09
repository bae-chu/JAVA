package classex;

public class NewInstanceTest {
	public static void main(String[] args) throws ClassNotFoundException, 
	InstantiationException, IllegalAccessException {
		
		Person person1 = new Person();
		System.out.println(person1);
		
		Class pClass = Class.forName("classex.Person");
		
		Object obj = pClass.newInstance();	//������ �ν��Ͻ��� �����ϴ��� Ȯ���� �غ��� ���� ����. 
		Person person2 = null;				//if�� �ν��Ͻ� �ִ��� Ȯ���غ���
		if(obj instanceof Person) {
			person2=(Person)obj;
		}
//		Person person2 = (Person)pClass.newInstance();
		System.out.println(person2);
	}

}
	