package classpart;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
	String st;

	//å p.141~142 ����
	public void showStudentInfo() {
		System.out.println(studentName+ "," + address);
	}
	
	public String getStudentName() { // get�� �Ű�����() ����, return�� ����
		return studentName;
	}
	public void setStudentname(String name) { //set�� �Ű�����(String name)�ְ�, return����. 
		studentName = name;
	}
	public static void main(String[] args) {
		Student studentAhn = new Student(); //Student Ŭ���� ����
		studentAhn.studentName="�ȿ���";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
		}
}

