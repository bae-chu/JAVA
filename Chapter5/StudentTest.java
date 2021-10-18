package classpart;

public class StudentTest {
	public static void main(String[] args) {
		classpart.Student studentAhn = new Student(); // 동일 클래스이므로 사실 맨 앞에 classpart.는  생략가능
		studentAhn.studentName="안승연";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}

}
