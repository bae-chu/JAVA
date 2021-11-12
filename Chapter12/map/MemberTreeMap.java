package map.treemap;

import java.util.Iterator;
import java.util.TreeMap;
import collection.Member;

//class MyCompare implements comparator<Integer>{	내림차순 정렬 코딩
//	@Override
//	public int compare(Integer o1, Integer o2) {
//		return o1.compareTo(o2)*(-1);
//	}
//}

public class MemberTreeMap {
	private TreeMap<Integer, Member> treeMap;
	
	public MemberTreeMap() {
		treeMap = new TreeMap<Integer, Member>();//괄호안에 new MyCompare();
	}
	
	public void addMember(Member member) {
		treeMap.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memberId) {
		if(treeMap.containsKey(memberId)) {
			treeMap.remove(memberId);
			return true;
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		Iterator<Integer> ir = treeMap.keySet().iterator();
		while(ir.hasNext()) {
			int key = ir.next();
			Member member = treeMap.get(key);
			System.out.println(member);
		}
		System.out.println();
	}

}
