package staticex;

public class Student1 {
	public static int serialNum = 1000;
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public Student1() {
		serialNum++; //클래스 변수. 호출할 때마다 값이 1씩 늘어나게 설정
		studentID=serialNum; //인스턴스변수
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName=name;
	}

}
