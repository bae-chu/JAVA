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
��Ű�� : shape.vo(value object)

1. �簢���� ��Ÿ���� Ŭ���� rectangle
2. ������� : ���� height  ���� : width  => 32��Ʈ ������ private��
3. �� ��������� ���Ͽ� get�� set ����, public. 
4. �޼ҵ� : �簢���� ������ ���Ͽ� ��ȯ�ϴ� �޼���, �Ű����� ����, public���� . 
	�̸� - getArea 
*/