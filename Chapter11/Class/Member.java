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
		System.out.println("회원 " + id + "의 이름 : " + name + ", 등급 : " + grade);
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


/* 멤버변수 name, id, grade 초기등급값은 N
 * 객체 생성시 자동으로 id 할당(m10001)
 * 객체를 출력하면 이름, id 출력됨
 * 해시코드() 호출하면 id가 출력됨
 * 생성시 매개변수는 1개
 * 
 */
