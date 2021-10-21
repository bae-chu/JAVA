package shape.vo;

public class Rectangle {
	
	private int height;
	private int width;
	private int area;
	
/*	public Rectangle(int h, int w, int a) {
		this.height=h;
		this.width=w;
		this.area=a;
	}
*/	
	public Rectangle() {}
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getArea() {
		return height*width;
	}
	

}
/*
패키지 : shape.vo(value object)

1. 사각형을 나타내는 클래스 rectangle
2. 멤버변수 : 높이 height  넓이 : width  => 32비트 정수형 private로
3. 각 멤버변수에 대하여 get랑 set 설정, public. 
4. 메소드 : 사각형의 면적을 구하여 반환하는 메서드, 매개변수 없음, public으로 . 
	이름 - getArea 
*/
