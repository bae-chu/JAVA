package ex;

import java.util.HashMap;

public class CarFactory {
	private HashMap<String, Car> hashMap;	//키를 String, value를 car
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

	public Car createCar(String key) { //키값을 받을꺼니까 알아보기쉽게 key로 설정 
		Car car = null;
		if(!hashMap.containsKey(key)) { //키 값을 넣어서 확인해보는거. 있으면 리턴. 없으면 새로생성
			hashMap.put(key, new Car());//! 넣어서, 해시맵에 값 없으면 카를 새로 생성
		}
		car = hashMap.get(key);	//해시맵에서 키를 가져오고, 해시맵에 없다면 새로 만들어서 갖고오고. 
			
		return car; 
	}
	
}
