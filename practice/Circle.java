package pratices;

public class Circle {
	public double radius;
	public double PI=3.141592;
	
	
	public Circle(double radius) { //������ ����
		this.radius=radius;
	}
	
	public double getArea() {	//������ ���ϴ� �޼ҵ�
		return radius*radius*PI;
	}

}
/*
���� - 3. ������ ������ Circle Ŭ������ ����� ������ �����ϴ� Cylinder Ŭ������ �ۼ��Ͻÿ�.
�� ������ ��Ÿ���� Cylinder Ŭ������ Circle���� ���� �Ǽ����� ���̸� �ʵ�� ����
�� �޼ҵ� getVolume()�� ������ ���Ǹ� ��ȯ
�� Cylinder Ŭ������ main() �޼ҵ忡�� �������� 2.8, ���̰� 5.6�� ������ ���Ǹ� ���
�� ������ ���� ��Ÿ���� Ŭ���� Circle
*/