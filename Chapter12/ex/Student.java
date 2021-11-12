package ex;

public class Student implements Comparable<Student> {
	String stuNum;
	String name; 
	// 1. ������� �����

	public Student(String stuNum, String name) {
		this.stuNum = stuNum;
		this.name = name;
	}
	// 2. ������ �����
	// 3. test���� syso(set)�̷��� �����ϱ� set ����ϸ� ��ȣ:�̸��� �������� �ؾ���.
	// 4. toString ���� ������

	@Override
	public String toString() {
		return stuNum + " : " + name;
	}
	//5. �ߺ��Ǵ� ��ȣ�� �����ؾ��ϹǷ� ����, �ؽ��ڵ� �߰�
	
	@Override
	public boolean equals(Object obj) {	//6. �Ѿ���� ������Ʈ�� student ��ü
		if(obj instanceof Student) {	//�Ѿ���� obj��  student?
			Student s = (Student)obj;	//��ü �ϳ� ������ְ�
			if(this.stuNum.equals(s.stuNum)) //�� ���ڰ� s.stuNum�̶� ������ Ȯ��
			return true;
		}
		return false;
	}
	@Override
	public int hashCode() {
		return Integer.parseInt(stuNum);
	}
	@Override
	public int compareTo(Student stu) {
		return this.stuNum.compareTo(stu.name);
	}
	
}