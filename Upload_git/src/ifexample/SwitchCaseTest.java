package ifexample;

public class SwitchCaseTest {
	public static void main(String[] args) {

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
	}
}

/*
 * String medal = "Silver";
 * 
 * switch (medal) { case "Gold": System.out.println("�ݸ޴��Դϴ�."); break; case
 * "Silver": System.out.println("�ݸ޴��Դϴ�."); break; case "Bronze":
 * System.out.println("���޴��Դϴ�."); break; default:
 * System.out.println("�޴��� �����ϴ�."); break;
 */