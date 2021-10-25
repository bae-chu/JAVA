package singleton;


public class CarFactoryTest {
	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();
		Car mySonata = factory.createCar();
		Car yourSonata = factory.createCar();
		System.out.println(mySonata.getCarNum());
		System.out.println(yourSonata.getCarNum());
	}

}

/*
ī Ŭ���� �ȿ� ī �ѹ���� ������� �ʿ� 

Ŭ������ �ΰ��ʿ���. 
car factory 
car


car factory�� �� �ν��Ͻ� �� �����ϱ� �̰� �̱��� ������ �����ǵ��� ��������.
�ٵ� �̹ؿ� ���丮.createCar()�� �޼ҵ尡 ����. 
createCar�� ����Ÿ���� Car
�ֳĸ� �ؿ� Car  mySonata ��� �׾��ϱ�. 


-----------------------------------------------------
�׸��� Car Ŭ���� ����
getCarNum()�̶��� ����.
�̰� get �޼ҵ�ϱ� carNum�̶�� ��������� �ְ���.  
-----------------------------------------------------
��Ʈ : student Ŭ���� �ȿ� �й� �ڵ������ϱ� �ڵ� Ȱ��(�л� �����ɶ� �й� �߰��Ǵ� �ڵ� �־���)
��ä������ų�� �ڵ��� ��ȣ ������ �ؾ��ϴϱ�. 
*/