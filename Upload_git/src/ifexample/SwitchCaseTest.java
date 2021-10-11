package ifexample;

public class SwitchCaseTest {
	public static void main(String[] args) {

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
	}
}

/*
 * String medal = "Silver";
 * 
 * switch (medal) { case "Gold": System.out.println("금메달입니다."); break; case
 * "Silver": System.out.println("금메달입니다."); break; case "Bronze":
 * System.out.println("동메달입니다."); break; default:
 * System.out.println("메달이 없습니다."); break;
 */