package test.Q6;


public class CardTest {
	
	public static void main(String[] args) {
		
		CardCompany company = CardCompany.getInstance("삼성");
				
		Card myBC = company.createCard("BC");
		Card myVisa = company.createCard("Visa");
		
		System.out.println("카드회사 : " + company.companyName);
		System.out.println(myBC.getCardName()+" : " + myBC.getCardNum());
		System.out.println(myVisa.getCardName()+" : " + myVisa.getCardNum());
		
		
	/*	Card card1 = new Card("삼성카드");
		Card card2 = new Card("신한카드");
		Card card3 = new Card();
				
		System.out.println(card1.cardName + " 카드번호 : " + card1.getCardNum());
		System.out.println(card2.cardName + " 카드번호 : " + card1.getCardNum());
		System.out.println(card3.cardName + " 카드번호 : " + card1.getCardNum());
	*/
	}

}