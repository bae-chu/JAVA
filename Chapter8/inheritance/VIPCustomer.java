package inheritance;

public class VIPCustomer extends Customer{
	private int agentID;
	double saleRatio;
	
//	public VIPCustomer() {
//		customerGrade = "VIP";
//		bonusRatio = 0.05;
//		saleRatio = 0.1;
//		System.out.println("VIPCustomer() 생성자 호출");
//	}
	
	public int getAgentID() {
		return agentID;
	}

	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName); //디폴트 생성자가 없으면 super를 반드시 호출해야함
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID=agentID;
		System.out.println("VIPCustomer() 생성자 호출");
		
		
	}

}

