package shape.vo;

public class Triangle {
	private int width;
	private int height;
	private double area;
	
	public Triangle(int h, int w) {
		height = h;
		width = w;
	}
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public double getArea() {
		return (width*height)/2.0; //double�� ����Ϸ��� �Է½� 2�� �ƴ϶� 2.0 �־�� �Ǽ��� ����. 
	}
	
	}


/*
1. �ﰢ�� Ŭ���� triangle
2. ������� : �غ� width ���� height -> 32��Ʈ ������ private
3. ��ü�� ������ �� �غ��� ���̸� �Է¹޾� ��� ������ �Ҵ�.  public 
4. getter setter ���� public
5. get Area : ������ ��ȯ. ��ȯ�� : �Ǽ� 
*/