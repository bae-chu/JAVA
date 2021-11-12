package ex;

import java.util.Comparator;

public class MyCompare<T> implements Comparator<T> {

	@Override
	public int compare(T o1, T o2) {
		if(o1 instanceof Student && o2 instanceof Student) {
			Student stu1 = (Student)o1;
			Student stu2 = (Student)o2;
			return stu1.stuNum.compareTo(stu2.stuNum) *(-1);
		}
		return 0;
	}


}

