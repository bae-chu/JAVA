package classpart;

public class OrderTest {
	public static void main(String[] args) {
		
		Order order = new Order();
		
		order.odnum=201803120001L;
		order.id="abc123";
		order.oddate="2018년 3월 12일";
		order.name="홍길순";
		order.pdnum="PD0345-12";
		order.address="서울시 영등포구 여의도동 20번지";
		
		System.out.println("주문번호 : "+ order.odnum);
		System.out.println("주문자ID : "+ order.id);
		System.out.println("주문날짜 : "+ order.oddate);
		System.out.println("주문자 이름 : "+ order.name);
		System.out.println("주문상품번호 : "+ order.pdnum);
		System.out.println("배송주소 : "+ order.address);
		
		
	}
}

/*

int odnum;
String id;
String oddate;
String name;
String pdnum;
String address;

*/