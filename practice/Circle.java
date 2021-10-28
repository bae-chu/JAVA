package pratices;

public class Circle {
	public double radius;
	public double PI=3.141592;
	
	
	public Circle(double radius) { //생성자 구현
		this.radius=radius;
	}
	
	public double getArea() {	//원면적 구하는 메소드
		return radius*radius*PI;
	}

}
/*
문제 - 3. 다음에 구현된 Circle 클래스를 참고로 다음을 만족하는 Cylinder 클래스를 작성하시오.
· 원통을 나타내는 Cylinder 클래스는 Circle형의 원과 실수형의 높이를 필드로 선언
· 메소드 getVolume()은 원통의 부피를 반환
· Cylinder 클래스의 main() 메소드에서 반지름이 2.8, 높이가 5.6의 원통의 부피를 출력
· 다음은 원을 나타내는 클래스 Circle
*/