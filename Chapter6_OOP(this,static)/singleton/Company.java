package singleton;

public class Company {
	private static Company instance = new Company(); //클래스로 접속해야하므로 static 붙이고
	
	private Company() {}
	
	
	public static Company getInstance() { //클래스 메소드로 만들어야 상관없이 호출 가
		if(instance == null) {
			instance = new Company();
		}
		return instance; //객채가 생성된 상태면 그냥 생성된 그거 계속 씀. 이거 안쓰면 계속 새로 만들게 됨. 
	}
	

}
