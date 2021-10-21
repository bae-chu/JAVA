package thisex;

	
class BirthDay {//다른클래스 넣기위해선 접근제어자(public)이 없어야함
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
	public class ThisExample { //BirthDay 테스트를 위한 클래스
		public static void main(String[] args) {
			BirthDay bDay = new BirthDay();
			bDay.setYear(2000);
			System.out.println(bDay);
			bDay.printThis();
			
		}//this : 생성된 인스턴스 객체를 일컫는 말.

}
