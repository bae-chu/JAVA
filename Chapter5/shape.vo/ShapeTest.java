package shape.vo;

import shape.vo.Rectangle;
import shape.vo.Triangle;

public class ShapeTest {
	public static void main(String[] args) {
		
		Rectangle rt = new Rectangle();
		rt.setHeight(20);
		rt.setWidth(30);
				
		System.out.println("�簢�� ���� : "+rt.getHeight()+", ���� : "+rt.getWidth()+", ���� : "+ rt.getArea());
		
		
		Triangle ta = new Triangle(35, 15);
		System.out.println("�ﰢ�� ���� : "+ta.getHeight()+", �غ� : "+ta.getWidth()+", ���� : " + ta.getArea());
	}

}
