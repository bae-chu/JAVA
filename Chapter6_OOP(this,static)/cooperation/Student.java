package cooperation;

public class Student {
	public String studentName; // 이름
	public int grade; 		// 학년
	public int money; 		// 가지고 있는 돈

	public Student(String studentName, int money) { // 디폴트 생성자가없으면 () 안에 다 적어야함. 
		this.studentName = studentName;
		this.money = money;
	}

	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}

	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}
	
	public void takeTaxi(Taxi taxi, int takeMoney) {
		taxi.take(takeMoney);
		this.money -= takeMoney;
	}

	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은 " + money + "입니다.");
	}
}
