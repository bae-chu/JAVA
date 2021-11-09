package classex;

public class Member {

	private String name;
	private String id;
	private char grade;
	
	private static int serialNum = 10000;
	
	public Member(String name) {
		this.name=name;
		id = "M" + serialNum++;
		grade = 'N';
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public void showInfo() {
		System.out.println("ȸ�� " + id + "�� �̸� : " + name + ", ��� : " + grade);
	}

	@Override
	public String toString() {
		return id + ", " + name;
	}

	@Override
	public int hashCode() {
		return Integer.parseInt(id.substring(1));
	}
	
	

		
	}


/* ������� name, id, grade �ʱ��ް��� N
 * ��ü ������ �ڵ����� id �Ҵ�(m10001)
 * ��ü�� ����ϸ� �̸�, id ��µ�
 * �ؽ��ڵ�() ȣ���ϸ� id�� ��µ�
 * ������ �Ű������� 1��
 * 
 */
