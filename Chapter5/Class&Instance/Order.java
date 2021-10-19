package classpart;

import java.sql.Date;

public class Order {
	
	long orderNum; // 번호가 0으로 시작되면 컴퓨터가 인식을 못하기때문에, 번호가 길면 String 써도 무방함.
	String orderId;
	Date orderDate;
	String orderName;
	String productNum;
	String orderAdd;

	
	public long getOrderNum() {
		return orderNum;
	}	
	public void setOrderNum(long orderNum) {
		this.orderNum=orderNum;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId=orderId;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate=orderDate;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName=orderName;
	}
	public String getProductNum() {
		return productNum;
	}
	public void setProductNum(String productNum) {
		this.productNum=productNum;
	}
	public String getOrderAdd() {
		return orderAdd;
	}
	public void setOrderAdd(String orderAdd) {
		this.orderAdd=orderAdd;
	}
}
