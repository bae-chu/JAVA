package thisex;

class Person{
	String name;
	int age;
	
	Person(){ //클래스안에 생성자 여러개 있을때 여기 this로 밑의 Person(String, int) 생성자 호출함.
		this("이름없음", 1); //this 말고 person으로 호출하게되면 메소드가 정의 안됐다고 오류뜸.
						//this 생성자 클래스 자신의 생성자를 뜻함. 생성자 안에서만 사용함. 

	
	//	name="이름 없음"
	//	age=1;		위에 this("이름없음", 1)이거랑 밑에 두줄이랑 동일한 역할.
	}
	
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	Person returnItSelf(){
		return this;
	}

}
public class CallAnotherConst {
	public static void main(String[] args) {
		Person noName=new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person p = noName.returnItSelf(); 
		System.out.println(p);
		System.out.println(noName);
		}
	}


