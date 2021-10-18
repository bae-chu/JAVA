package classpart;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
	String st;

	//책 p.141~142 참조
	public void showStudentInfo() {
		System.out.println(studentName+ "," + address);
	}
	
	public String getStudentName() { // get은 매개변수() 없고, return이 있음
		return studentName;
	}
	public void setStudentname(String name) { //set은 매개변수(String name)있고, return없음. 
		studentName = name;
	}
	public static void main(String[] args) {
		Student studentAhn = new Student(); //Student 클래스 생성
		studentAhn.studentName="안연수";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
		}
}

