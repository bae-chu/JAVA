package classpart;

public class ManTest {
	
	public static void main(String[] args ) {
		
		Man man = new Man(); // 이걸 생성해야지 Man(인스턴스 변수)을 쓸 수 있음

		
		man.setAge(40);//이렇게 써도 되긴하는데, manclass 파일에 int age 앞에 private라고 적혀있으면 이거 못씀
		//man.setAge(40); 다르게 쓰려면 이렇게 쓸 수 있음
		man.name = "James";
		man.setMarried(true);
		man.child = 4;

		System.out.println("이 사람의 나이  " + man.age);
		System.out.println("이 사람의 이름  " + man.getName());
		System.out.println("이 사람의 결혼여부  " + man.isMarried);
		System.out.println("이 사람의 자녀 수  " + man.getChild());
	}
}
