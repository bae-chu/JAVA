package classex;

class MyDog{
	String name;
	String type;
	
	MyDog(String name, String type) {
		this.name=name;
		this.type=type;
	}
	@Override
	public String toString() {
		return type + "," + name;
	}
}

public class Q4 {
	public static void main(String[] args) {
		
		MyDog dog = new MyDog("멍멍이", "진돗개");
		System.out.println(dog);
	}

//멍멍이 진돗개를 반대로 출력하기

}
