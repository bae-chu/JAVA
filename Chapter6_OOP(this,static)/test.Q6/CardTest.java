package test.Q6;


public class CardTest {
	
	public static void main(String[] args) {
		
		CardCompany company = CardCompany.getInstance("�Ｚ");
				
		Card myBC = company.createCard("BC");
		Card myVisa = company.createCard("Visa");
		
		System.out.println("ī��ȸ�� : " + company.companyName);
		System.out.println(myBC.getCardName()+" : " + myBC.getCardNum());
		System.out.println(myVisa.getCardName()+" : " + myVisa.getCardNum());
		
		
	/*	Card card1 = new Card("�Ｚī��");
		Card card2 = new Card("����ī��");
		Card card3 = new Card();
				
		System.out.println(card1.cardName + " ī���ȣ : " + card1.getCardNum());
		System.out.println(card2.cardName + " ī���ȣ : " + card1.getCardNum());
		System.out.println(card3.cardName + " ī���ȣ : " + card1.getCardNum());
	*/
	}

}