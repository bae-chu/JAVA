package ex;

import java.util.HashMap;

public class CarFactory {
	private HashMap<String, Car> hashMap;	//Ű�� String, value�� car
	private static CarFactory carFactory;
	private CarFactory() {
		hashMap = new HashMap<String, Car>();
	}
	public static CarFactory getInstance() {
		if(carFactory == null) {
			carFactory = new CarFactory();
		}
		return carFactory;
	}

	public Car createCar(String key) { //Ű���� �������ϱ� �˾ƺ��⽱�� key�� ���� 
		Car car = null;
		if(!hashMap.containsKey(key)) { //Ű ���� �־ Ȯ���غ��°�. ������ ����. ������ ���λ���
			hashMap.put(key, new Car());//! �־, �ؽøʿ� �� ������ ī�� ���� ����
		}
		car = hashMap.get(key);	//�ؽøʿ��� Ű�� ��������, �ؽøʿ� ���ٸ� ���� ���� �������. 
			
		return car; 
	}
	
}
