package collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add(new String("������"));
		hashSet.add(new String("������"));
		hashSet.add(new String("ȫ����"));
		hashSet.add(new String("������"));
		hashSet.add(new String("������"));
	
		System.out.println(hashSet);
		
//		Iterator<String> ir = hashSet.iterator();
//		while(ir.hasNext()) {
//			System.out.println(ir.next());
//		}
	}
}


