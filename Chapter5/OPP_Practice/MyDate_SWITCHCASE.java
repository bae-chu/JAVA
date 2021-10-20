package test;

public class MyDate_SWITCHCASE {

	private int day;
	private int month;
	private int year;
	public boolean isValid=false;
	
	public MyDate_SWITCHCASE(int day, int month, int year) {
		this.day=day;
		this.month=month;
		this.year=year;	//day, month, year를 매개변수로 받는 생성자 만듦
		
	}
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		
		switch(month) {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
			if(day>=1 && day<=31) {
				this.day=day;
				isValid=true;
			}
			break;
			
		case 4 : case 6 : case 9 : case 11 :
			if(day>=1 && day<=30) {
				this.day=day;
				isValid=true;
			}
			break;
			
		case 2 :
			if(isLeapYear()) {
				if(day>=1 && day<=28) {
					this.day=day;
					isValid=true;
				}
			}
			//(year%4==0&&year%100!=0||year%400==0) {
			//	if(day==29) {
			//		if(day<1||day>28) {
			//			isValid=false;
			//		}else {
			//			this.day=day;
				
				}			
		}
			
	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if(month >=1 && month <=12) { //1과 같거나 크면서(&&and) 12와 같거나 작은경우
		this.month=month;
		}
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year=year;
	}
	
	public boolean isValid() {
		return isValid;
	}
	
	private boolean isLeapYear() {
		if(year % 4 ==0) {
			if(year%100==0) {
				if(year % 400 == 0) {
					return true;
				} else {
					return false;
				}
			} else {
			return true;
			}	
		} else {
			return true;
	}
}

}