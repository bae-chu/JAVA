package thisex;

class Person{
	String name;
	int age;
	
	Person(){ //Ŭ�����ȿ� ������ ������ ������ ���� this�� ���� Person(String, int) ������ ȣ����.
		this("�̸�����", 1); //this ���� person���� ȣ���ϰԵǸ� �޼ҵ尡 ���� �ȵƴٰ� ������.
						//this ������ Ŭ���� �ڽ��� �����ڸ� ����. ������ �ȿ����� �����. 

	
	//	name="�̸� ����"
	//	age=1;		���� this("�̸�����", 1)�̰Ŷ� �ؿ� �����̶� ������ ����.
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


