package test.Q5;

public class TakeCafe {
	public static void main(String[] args) {
		
		Person kim = new Person("��ö��", 20000);
		Person lee = new Person("�̿���", 20000);
		
		Star star = new Star("1ȣ��");
		Bean bean = new Bean("������");
		
		kim.takeStar(star, 4000);
		lee.takeBean(bean, 4500);
		
		kim.showInfo();
		lee.showInfo();
		
		star.showInfo();
		bean.showInfo();
	}

}
