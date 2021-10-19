package classpart;

import java.sql.Date;

public class OrderHistory {
	public static void main(String[] args) {
		
		Order order = new Order();
		
		
		order.setOrderNum(201803120001L);
		order.setOrderId("abc123");
		order.setOrderDate(new Date(2018,3,12)); 
		order.setOrderName("홍길순");
		order.setProductNum("PD0345-12");
		order.setOrderAdd("서울시 영등포구 여의도동 20번지");
		
		System.out.println("주문번호 : " + order.getOrderNum());
		System.out.println("주문자 아이디 : " + order.getOrderId());
		System.out.println("주문 날짜 : " + order.getOrderDate().getYear() 
				+ "년 " + order.getOrderDate().getMonth()+"월 "
				+ order.getOrderDate().getDate()+"일");
		System.out.println("주문자 이름 : " + order.getOrderName());
		System.out.println("주문 상품 번호 : " + order.getProductNum());
		System.out.println("배송 주소 : " + order.getOrderAdd());
		
		/*
		order.orderNum=201803120001L;
		order.orderId="abc123";
		order.orderDate="2018년 3월 12일";
		order.orderName="홍길순";
		order.productNum="PD0345-12";
		order.orderAdd="서울시 영등포구 여의도동 20번지";
		
		System.out.println("주문번호 : " + order.orderNum);
		System.out.println("주문자 ID : " + order.orderId);
		System.out.println("주문 날짜 : " + order.orderDate);
		System.out.println("주문자 이름 : " + order.orderName);
		System.out.println("주문 상품 번호 : " + order.productNum);
		System.out.println("배송 주소 : " + order.orderAdd);
		*/
	}
}
