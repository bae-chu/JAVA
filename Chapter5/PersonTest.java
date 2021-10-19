package constructor;

public class PersonTest {
	public static void main(String[] args) {
		
		Person personKim = new Person(); //생성자에는 리턴타입이 있으면 안됨. 
		personKim.name="김유신";
		personKim.weight=85.5F;
		personKim.height=180.0F;
		
		Person personLee = new Person("이순신", 175, 75);
		//Person 클래스서 만들어놓은  public Person(String pname, float pheight, float pweight) 
		//이 생성자를 받아서 위와 같이 사용할 수 있음.
		//교재처럼 personkim.name="김유신" 이거 안적어도 11행처럼 사용 가능.
		//11행이 6~9행을 퉁칠 수 있음. 
	}

}