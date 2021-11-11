package collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

import collection.Member;

public class MemberHashSet {
	private HashSet<Member> hashSet;
	
	public MemberHashSet() {
		hashSet = new HashSet<Member>();
	}
	
	public void addMember(Member member) {
		hashSet.add(member);
	}
	
	public boolean removeMember(int memberId) {
//		Iterator<Member> ir = hashSet.iterator();
//		
//		while(ir.hasNext()) {
//			Member member = ir.next();
//			int tempId = member.getMemberId();
//			if(tempId == memberId) {
//				hashSet.remove(member);
//				return true;	//while 사용 버전
//			}
//		}
		
		for(Member member : hashSet) {
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				hashSet.remove(member);
				return true;	//향상된 for문 사용 버전
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		for(Member member : hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}
	

}
