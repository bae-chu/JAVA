package classpart;

public class StudentTest1 {
	public static void main(String[] args) {
		
		Student student1 = new Student(); // ù ��° �л� ����
		student1.studentName="�ȿ���";
		student1.st=("test1");
		
		Student student2 = new Student();// �� ��° �л� ����
		student2.studentName="�Ƚ¿�";
		student2.address="test2";
		
		System.out.println(student1.getStudentName());
		System.out.println(student2.getStudentName());
		System.out.println(student1.st);
		System.out.println(student2.address);
				
	}
	

}

