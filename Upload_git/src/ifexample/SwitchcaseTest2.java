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
		
		System.out.println("������ " + score + "�� �̰�, ������ " + grade + "�Դϴ�.");
	}
}


/*
int F = 4;
String shop = ""; //���ڿ��� ��������� "" ä���־�� ��. 

switch (F) {

case 1:
	shop = "�౹";
	break;
case 2:
	shop = "�����ܰ�";
	break;
case 3:
	shop = "�Ǻΰ�";
	break;
case 4:
	shop = "ġ��";
	break;
case 5:
	shop = "�ｺŬ��";
}

System.out.println(F + "�� " + shop + "�Դϴ�.");

*/