package classex;

import java.util.ArrayList;

public class MemberTest {
	public static void main(String[] args) {
		ArrayList<Member> list = new ArrayList<Member>();
		
		list.add(new Member("ȫ�浿"));
		list.add(new Member("�̼���"));		
		list.add(new Member("������"));
		
		for(Member m : list) {
		System.out.println(m);
		System.out.println(m.hashCode());
		m.showInfo();
	}
}
}