package singleton;

public class Car {
	private static int serialNum=10000; //�߿�
	private int carNum;


	
	public Car() {
		serialNum++;
		carNum = serialNum;
	}


	public int getCarNum() {
		return carNum;
	}

	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}


	

}
/*
package staticex;

public class Student1 {
	public static int serialNum = 1000;
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public Student1() {
		serialNum++; //Ŭ���� ����. ȣ���� ������ ���� 1�� �þ�� ����
		studentID=serialNum; //�ν��Ͻ�����
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName=name;
	}

}
*/