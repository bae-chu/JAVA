package constructor;

public class Person {
	String name;
	float height;
	float weight; //�Ű����� 3��. �̸�, Ű, ������
	
	public Person() {} //����Ʈ ������ ������ְ�
	
	public Person(String pname, float pheight, float pweight) {
		name = pname;
		height = pheight;
		weight = pweight; // �̸�, Ű, �������� �Ű������� �޴� ������ ���� 
	}
}
