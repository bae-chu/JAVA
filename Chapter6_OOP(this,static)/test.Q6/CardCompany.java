package test.Q6;

public class CardCompany {


	private static CardCompany instance;
	String companyName; // �� �޼ҵ� �߰������ �� 
	
	
	private CardCompany(String name) {
		companyName = name;
	}
		
	public static CardCompany getInstance(String name) {
	//  cardCompanyName = name; ���⿡ �̰� ������ �ȵǰ� 11��, 17�࿡ ���� �ο�
		if(instance == null) {
			instance = new CardCompany(name);
		}
		return instance;
	}
	public Card createCard(String cardName) { //���⵵ ���� cardName �־���
		return new Card(cardName);
	}

	
}
