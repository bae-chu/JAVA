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
카 클래스 안에 카 넘버라는 멤버변수 필요 

클래스가 두개필요함. 
car factory 
car


car factory에 겟 인스턴스 가 있으니까 이건 싱글톤 패턴이 생성되도록 만들어야함.
근데 이밑에 팩토리.createCar()란 메소드가 있음. 
createCar의 리턴타입은 Car
왜냐면 밑에 Car  mySonata 등등 잉쓰니까. 


-----------------------------------------------------
그리고 Car 클래스 보면
getCarNum()이란게 있음.
이건 get 메소드니까 carNum이라는 멤버변수가 있겠지.  
-----------------------------------------------------
힌트 : student 클래스 안에 학번 자동생성하기 코드 활용(학생 생성될때 학번 추가되는 코드 있었음)
객채생성시킬때 자동차 번호 구현을 해야하니까. 
*/