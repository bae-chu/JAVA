package ex;

public class Student implements Comparable<Student> {
	String stuNum;
	String name; 
	// 1. 멤버변수 만들기

	public Student(String stuNum, String name) {
		this.stuNum = stuNum;
		this.name = name;
	}
	// 2. 생성자 만들기
	// 3. test에서 syso(set)이렇게 있으니까 set 출력하면 번호:이름이 나오도록 해야함.
	// 4. toString 으로 재정의

	@Override
	public String toString() {
		return stuNum + " : " + name;
	}
	//5. 중복되는 번호는 제거해야하므로 이퀄, 해시코드 추가
	
	@Override
	public boolean equals(Object obj) {	//6. 넘어오는 오브젝트는 student 객체
		if(obj instanceof Student) {	//넘어오는 obj가  student?
			Student s = (Student)obj;	//객체 하나 만들어주고
			if(this.stuNum.equals(s.stuNum)) //이 숫자가 s.stuNum이랑 같은지 확인
			return true;
		}
		return false;
	}
	@Override
	public int hashCode() {
		return Integer.parseInt(stuNum);
	}
	@Override
	public int compareTo(Student stu) {
		return this.stuNum.compareTo(stu.name);
	}
	
}