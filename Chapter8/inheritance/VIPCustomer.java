package inheritance;

public class VIPCustomer extends Customer{
	private int agentID;
	double saleRatio;
	
//	public VIPCustomer() {
//		customerGrade = "VIP";
//		bonusRatio = 0.05;
//		saleRatio = 0.1;
//		System.out.println("VIPCustomer() ������ ȣ��");
//	}
	
	public int getAgentID() {
		return agentID;
	}

	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName); //����Ʈ �����ڰ� ������ super�� �ݵ�� ȣ���ؾ���
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID=agentID;
		System.out.println("VIPCustomer() ������ ȣ��");
		
		
	}

}

