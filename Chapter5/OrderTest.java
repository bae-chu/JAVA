package classpart;

public class OrderTest {
	public static void main(String[] args) {
		
		Order order = new Order();
		
		order.odnum=201803120001L;
		order.id="abc123";
		order.oddate="2018�� 3�� 12��";
		order.name="ȫ���";
		order.pdnum="PD0345-12";
		order.address="����� �������� ���ǵ��� 20����";
		
		System.out.println("�ֹ���ȣ : "+ order.odnum);
		System.out.println("�ֹ���ID : "+ order.id);
		System.out.println("�ֹ���¥ : "+ order.oddate);
		System.out.println("�ֹ��� �̸� : "+ order.name);
		System.out.println("�ֹ���ǰ��ȣ : "+ order.pdnum);
		System.out.println("����ּ� : "+ order.address);
		
		
	}
}

/*

int odnum;
String id;
String oddate;
String name;
String pdnum;
String address;

*/