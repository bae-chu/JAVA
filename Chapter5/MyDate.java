package test;

public class MyDate {

	private int day;
	private int month;
	private int year;
	public boolean isValid=false;
	
	public MyDate(int day, int month, int year) {//day, month, year�� �Ű������� �޴� ������ ����
		this.year=year;
		setMonth(month);
		setDay(day);
	}
	//������ ���������� ����ǹǷ�, ��-��-�� ������ �Է��� ���ִ°� ����. 
		
		
	
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		if(month==2) {
			if(isLeapYear()) {
			if(day>=1 && day<=29) {
				this.day=day;
				isValid=true;
			}
		} else {
			if(isLeapYear()) {
				if(day>=1 && day<=28) {
					this.day=day;
					isValid=true;
				}
		}else if(month==1||month==3||month==5||month==7||month==8||month==10||month==12) {
			if(day>=1 && day<=31) {
				this.day=day;
				isValid=true;
			}
		else if(month==4||month==6||month==9||month==11) {
			if(day>=1 && day<=30) {
				this.day=day;
				isValid=true;
				}
				}
		}
		}
		}
	}
	


	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {

				this.month=month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year=year;
	}
	
		
		public boolean isLeapYear() {
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




		public boolean isValid() {
			return false;
		}




		
}
