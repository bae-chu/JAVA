package classpart;
//man Ŭ���� �ۼ��ϰ�(���� �̸� ��ȥ���� �ڳ��)
//�ɹ������� ���Ͽ� getter, setter ������.(���� ���ʹ� �������� ���ε��� 4����) 
//man test Ŭ�������� man Ŭ���� �ν��Ͻ� ����., main �޼ҵ� �����ϰ�. 
//�� �����ϰ�, ������ ���. 
public class Man {

		int age;
		String name;
		boolean isMarried;
		int child;
		
		public int getAge() {//get�� �Ű����� ����
		//get�� ���ϰ� ����
			return age;
		}
		public void setAge(int age) {//set�� �Ű����� ����
		//set�� ���ϰ� ����
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name=name;
		}
		public boolean isMarried() {
			return isMarried;
		}
		public void setMarried(boolean isMarried) {
			this.isMarried=isMarried;
		}
		public int getChild() {
			return child;
		}
		public void setChild(int child) {
			this.child = child;
		}
		
		
	}

	