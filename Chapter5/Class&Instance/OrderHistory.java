package classpart;

import java.sql.Date;

public class OrderHistory {
	public static void main(String[] args) {
		
		Order order = new Order();
		
		
		order.setOrderNum(201803120001L);
		order.setOrderId("abc123");
		order.setOrderDate(new Date(2018,3,12)); 
		order.setOrderName("ȫ���");
		order.setProductNum("PD0345-12");
		order.setOrderAdd("����� �������� ���ǵ��� 20����");
		
		System.out.println("�ֹ���ȣ : " + order.getOrderNum());
		System.out.println("�ֹ��� ���̵� : " + order.getOrderId());
		System.out.println("�ֹ� ��¥ : " + order.getOrderDate().getYear() 
				+ "�� " + order.getOrderDate().getMonth()+"�� "
				+ order.getOrderDate().getDate()+"��");
		System.out.println("�ֹ��� �̸� : " + order.getOrderName());
		System.out.println("�ֹ� ��ǰ ��ȣ : " + order.getProductNum());
		System.out.println("��� �ּ� : " + order.getOrderAdd());
		
		/*
		order.orderNum=201803120001L;
		order.orderId="abc123";
		order.orderDate="2018�� 3�� 12��";
		order.orderName="ȫ���";
		order.productNum="PD0345-12";
		order.orderAdd="����� �������� ���ǵ��� 20����";
		
		System.out.println("�ֹ���ȣ : " + order.orderNum);
		System.out.println("�ֹ��� ID : " + order.orderId);
		System.out.println("�ֹ� ��¥ : " + order.orderDate);
		System.out.println("�ֹ��� �̸� : " + order.orderName);
		System.out.println("�ֹ� ��ǰ ��ȣ : " + order.productNum);
		System.out.println("��� �ּ� : " + order.orderAdd);
		*/
	}
}
