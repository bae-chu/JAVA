package pratices;

public class Cylinder {
	
	Circle cir;
	double height;
	
	public Cylinder(Circle cir, double height) {
		this.cir=cir;
		this.height=height;
				
	}
	public double getVolume() {
		return cir.getArea()*height;
	}
	
	
	public static void main(String[] args) {
		Circle cc = new Circle(2.8);
		Cylinder dd = new Cylinder(new Circle(2.8), 5.6);
		double height=5.6;
		
		System.out.println("������ ���� : " + cc.getArea()*height);
		System.out.println(dd.getVolume());
	
	}
	//�س��� * ����  = PIr^2h
}


