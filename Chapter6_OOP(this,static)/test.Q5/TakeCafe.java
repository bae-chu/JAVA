package test.Q5;

public class TakeCafe {
	public static void main(String[] args) {
		
		Person kim = new Person("±èÃ¶¼ö", 20000);
		Person lee = new Person("ÀÌ¿µÈñ", 20000);
		
		Star star = new Star("1È£Á¡");
		Bean bean = new Bean("¼º¼­Á¡");
		
		kim.takeStar(star, 4000);
		lee.takeBean(bean, 4500);
		
		kim.showInfo();
		lee.showInfo();
		
		star.showInfo();
		bean.showInfo();
	}

}
