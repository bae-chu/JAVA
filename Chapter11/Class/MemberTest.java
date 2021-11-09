package classex;

import java.util.ArrayList;

public class MemberTest {
	public static void main(String[] args) {
		ArrayList<Member> list = new ArrayList<Member>();
		
		list.add(new Member("È«±æµ¿"));
		list.add(new Member("ÀÌ¼ø½Å"));		
		list.add(new Member("±èÀ¯½Å"));
		
		for(Member m : list) {
		System.out.println(m);
		System.out.println(m.hashCode());
		m.showInfo();
	}
}
}