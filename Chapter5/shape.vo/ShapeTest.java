package shape.vo;

import shape.vo.Rectangle;
import shape.vo.Triangle;

public class ShapeTest {
	public static void main(String[] args) {
		
		Rectangle rt = new Rectangle();
		rt.setHeight(20);
		rt.setWidth(30);
				
		System.out.println("사각형 높이 : "+rt.getHeight()+", 넓이 : "+rt.getWidth()+", 면적 : "+ rt.getArea());
		
		
		Triangle ta = new Triangle(35, 15);
		System.out.println("삼각형 높이 : "+ta.getHeight()+", 밑변 : "+ta.getWidth()+", 면적 : " + ta.getArea());
	}

}
