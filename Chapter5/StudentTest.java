package classpart;

public class StudentTest {
	public static void main(String[] args) {
		classpart.Student studentAhn = new Student(); // ���� Ŭ�����̹Ƿ� ��� �� �տ� classpart.��  ��������
		studentAhn.studentName="�Ƚ¿�";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}

}
