package collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add(new String("임정순"));
		hashSet.add(new String("박현정"));
		hashSet.add(new String("홍연의"));
		hashSet.add(new String("강감찬"));
		hashSet.add(new String("강감찬"));
	
		System.out.println(hashSet);
		
//		Iterator<String> ir = hashSet.iterator();
//		while(ir.hasNext()) {
//			System.out.println(ir.next());
//		}
	}
}


