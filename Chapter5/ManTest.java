package classpart;

public class ManTest {
	
	public static void main(String[] args ) {
		
		Man man = new Man(); // �̰� �����ؾ��� Man(�ν��Ͻ� ����)�� �� �� ����

		
		man.setAge(40);//�̷��� �ᵵ �Ǳ��ϴµ�, manclass ���Ͽ� int age �տ� private��� ���������� �̰� ����
		//man.setAge(40); �ٸ��� ������ �̷��� �� �� ����
		man.name = "James";
		man.setMarried(true);
		man.child = 4;

		System.out.println("�� ����� ����  " + man.age);
		System.out.println("�� ����� �̸�  " + man.getName());
		System.out.println("�� ����� ��ȥ����  " + man.isMarried);
		System.out.println("�� ����� �ڳ� ��  " + man.getChild());
	}
}