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
		return (width*height)/2.0; //double로 계산하려면 입력시 2가 아니라 2.0 넣어야 실수로 나옴. 
	}
	
	}


/*
1. 삼각형 클래스 triangle
2. 멤버변수 : 밑변 width 높이 height -> 32비트 정수형 private
3. 객체를 생성할 때 밑변과 높이를 입력받아 멤버 변수에 할당.  public 
4. getter setter 설정 public
5. get Area : 면적을 반환. 반환형 : 실수 
*/