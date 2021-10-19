package constructor;

public class Person {
	String name;
	float height;
	float weight; //매개변수 3개. 이름, 키, 몸무게
	
	public Person() {} //디폴트 생성자 만들어주고
	
	public Person(String pname, float pheight, float pweight) {
		name = pname;
		height = pheight;
		weight = pweight; // 이름, 키, 몸무개를 매개변수로 받는 생성자 만듦 
	}
}
