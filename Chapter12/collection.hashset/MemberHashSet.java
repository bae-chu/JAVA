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
//				return true;	//while ��� ����
//			}
//		}
		
		for(Member member : hashSet) {
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				hashSet.remove(member);
				return true;	//���� for�� ��� ����
			}
		}
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	public void showAllMember() {
		for(Member member : hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}
	

}