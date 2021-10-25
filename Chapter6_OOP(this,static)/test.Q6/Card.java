package test.Q6;

public class Card {
	public static long serialNum = 1000000000000000L;
	public String cardName;
	//public long cardNum;
	private String cardNum; //외부에서 접근못하게 private 설정. 카드번호 4자리 끊어 표현하기위해 String
	
	public Card() {
		serialNum++;
		cardNum = String.valueOf(serialNum); // 4자리 끊어표현함
	}
	
	public Card(String cardName) { //test 페이지에서 카드 이름 입력하는 용
		this(); // 다른 생성자 호출
		this.cardName = cardName; //이렇게 하면 디폴트 생성자 만들 수 있음.
	} 

	public String getCardName() { 
		return cardName;
		
	}
	
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public String getCardNum() {	//카드번호는 외부에서 읽으면 안되므로 get만 만듦.
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

*/
