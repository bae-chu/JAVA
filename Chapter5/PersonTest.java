package constructor;

public class PersonTest {
	public static void main(String[] args) {
		
		Person personKim = new Person(); //�����ڿ��� ����Ÿ���� ������ �ȵ�. 
		personKim.name="������";
		personKim.weight=85.5F;
		personKim.height=180.0F;
		
		Person personLee = new Person("�̼���", 175, 75);
		//Person Ŭ������ ��������  public Person(String pname, float pheight, float pweight) 
		//�� �����ڸ� �޾Ƽ� ���� ���� ����� �� ����.
		//����ó�� personkim.name="������" �̰� ����� 11��ó�� ��� ����.
		//11���� 6~9���� ��ĥ �� ����. 
	}

}