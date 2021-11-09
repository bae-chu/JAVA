package classex;

public class NewInstanceTest {
	public static void main(String[] args) throws ClassNotFoundException, 
	InstantiationException, IllegalAccessException {
		
		Person person1 = new Person();
		System.out.println(person1);
		
		Class pClass = Class.forName("classex.Person");
		
		Object obj = pClass.newInstance();	//실제로 인스턴스가 존재하는지 확인을 해보는 것이 좋음. 
		Person person2 = null;				//if로 인스턴스 있는지 확인해보기
		if(obj instanceof Person) {
			person2=(Person)obj;
		}
//		Person person2 = (Person)pClass.newInstance();
		System.out.println(person2);
	}

}
	