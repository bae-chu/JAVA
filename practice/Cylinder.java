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
		
		System.out.println("원통의 부피 : " + cc.getArea()*height);
		System.out.println(dd.getVolume());
	
	}
	//밑넓이 * 높이  = PIr^2h
}


