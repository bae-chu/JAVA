package ex;

import java.util.TreeSet;

public class StudentTreeTest {
	public static void main(String[] args) {
		TreeSet<Student> set = new TreeSet<>(new MyCompare<>());
		set.add(new Student("100", "홍길동"));
		set.add(new Student("200", "강감찬"));
		set.add(new Student("300", "이순신"));
		set.add(new Student("400", "정약용"));
		set.add(new Student("100", "송중기"));
		
		System.out.println(set);
	}

}
