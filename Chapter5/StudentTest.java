package test;

import hiding.Student;

public class StudentTest {

	 public static void main(String[] args) {
		
		 Student studentLee = new Student();
		 
		 studentLee.setStudentId(1234);
		 studentLee.setStudentName("��ö��");
		 studentLee.setGrade(50);
		 studentLee.setAddress("�뱸");
		 
				 
		 System.out.println(studentLee.getStudentId());
		 System.out.println(studentLee.getStudentName());
		 System.out.println(studentLee.getGrade());
		 System.out.println(studentLee.getAddress());
	 }
}
