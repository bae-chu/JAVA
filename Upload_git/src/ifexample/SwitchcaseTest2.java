package ifexample;

public class SwitchcaseTest2 {
	public static void main(String[] args) {
		
		int score = 77;
		char grade; 
				
		switch ((int)score/10) {
		case 10 : 
		case 9 : 
			grade = 'A';
			break;
		case 8 : 
			grade = 'B';
			break;
		case 7 :
			grade = 'C';
			break;
		case 6 :
			grade = 'C';
			break;
		default : 
			grade = 'F';
			
		}
		
		System.out.println("성적은 " + score + "점 이고, 학점은 " + grade + "입니다.");
	}
}


/*
int F = 4;
String shop = ""; //문자열은 변수선언시 "" 채워넣어야 됨. 

switch (F) {

case 1:
	shop = "약국";
	break;
case 2:
	shop = "정형외과";
	break;
case 3:
	shop = "피부과";
	break;
case 4:
	shop = "치과";
	break;
case 5:
	shop = "헬스클럽";
}

System.out.println(F + "층 " + shop + "입니다.");

*/