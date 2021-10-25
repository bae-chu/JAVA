package test.Q6;

public class CardCompany {


	private static CardCompany instance;
	String companyName; // 이 메소드 추가해줘야 함 
	
	
	private CardCompany(String name) {
		companyName = name;
	}
		
	public static CardCompany getInstance(String name) {
	//  cardCompanyName = name; 여기에 이거 넣으면 안되고 11행, 17행에 각각 부여
		if(instance == null) {
			instance = new CardCompany(name);
		}
		return instance;
	}
	public Card createCard(String cardName) { //여기도 각각 cardName 넣어줌
		return new Card(cardName);
	}

	
}
