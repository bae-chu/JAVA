package test.Q6;

public class Card {
	public static long serialNum = 1000000000000000L;
	public String cardName;
	//public long cardNum;
	private String cardNum; //�ܺο��� ���ٸ��ϰ� private ����. ī���ȣ 4�ڸ� ���� ǥ���ϱ����� String
	
	public Card() {
		serialNum++;
		cardNum = String.valueOf(serialNum); // 4�ڸ� ����ǥ����
	}
	
	public Card(String cardName) { //test ���������� ī�� �̸� �Է��ϴ� ��
		this(); // �ٸ� ������ ȣ��
		this.cardName = cardName; //�̷��� �ϸ� ����Ʈ ������ ���� �� ����.
	} 

	public String getCardName() { 
		return cardName;
		
	}
	
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public String getCardNum() {	//ī���ȣ�� �ܺο��� ������ �ȵǹǷ� get�� ����.
		return cardNum.substring(0,4)+"-"+cardNum.substring(4,8)+
				"-"+cardNum.substring(8, 12)+"-"+cardNum.substring(12);
		
	}


	
	
}


/*


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