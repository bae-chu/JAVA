package singleton;

public class Company {
	private static Company instance = new Company(); //Ŭ������ �����ؾ��ϹǷ� static ���̰�
	
	private Company() {}
	
	
	public static Company getInstance() { //Ŭ���� �޼ҵ�� ������ ������� ȣ�� ��
		if(instance == null) {
			instance = new Company();
		}
		return instance; //��ä�� ������ ���¸� �׳� ������ �װ� ��� ��. �̰� �Ⱦ��� ��� ���� ����� ��. 
	}
	

}
