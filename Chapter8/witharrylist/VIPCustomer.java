package witharraylist;

public class VIPCustomer extends Customer {
	private int agentID;
	double saleRatio;
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade="VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1; //2차적으로 여기서 덮어씀 
		this.agentID = agentID;
	}
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	@Override
	public String showCustomerInfo() { 
		return super.showCustomerInfo() + "담당 상담원 번호는 " + agentID + "입니다.";
	}
	
	public int getAgent() {
		return agentID;
	}
	
}
