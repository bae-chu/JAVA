package object;

class MyDate {
	int day;
	int month;
	int year;
	
	public MyDate(int day, int month, int year) {
		this.day=day;
		this.month=month;
		this.year=year;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof MyDate) {	// ���� �ν��Ͻ��� �´������� Ȯ��
			MyDate md = (MyDate)obj; // obj�� ����ȯ
			if(this.day == md.day && this.month == md.month && this.year == md.year) { // and�� ��
				return true;
			}
		}
	
		return false;
	}

	@Override
	public int hashCode() {
	return Integer.parseInt(year+(month<10?"0":"")+month+(day<10?"0":"")+day);

	}
	
}

public class MyDateTest{
	public static void main(String[] args) {
		MyDate date1 = new MyDate(2004,9,18);
		MyDate date2 = new MyDate(9,18,2004);
		System.out.println(date1.equals(date2));
		
		System.out.print(date1.hashCode());
	}
}
