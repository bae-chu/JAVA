package thisex;

	
class BirthDay {//�ٸ�Ŭ���� �ֱ����ؼ� ����������(public)�� �������
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year=year;
	}
	
	public void printThis() {
		System.out.println(this);
	}
}
	public class ThisExample { //BirthDay �׽�Ʈ�� ���� Ŭ����
		public static void main(String[] args) {
			BirthDay bDay = new BirthDay();
			bDay.setYear(2000);
			System.out.println(bDay);
			bDay.printThis();
			
		}//this : ������ �ν��Ͻ� ��ü�� ���´� ��.

}
