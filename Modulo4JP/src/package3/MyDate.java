package package3;

public class MyDate {

	private int day, month, year;

	public MyDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return day + "/" + month + "/" + year ;
	}

	public boolean equals(MyDate m) {
		return this.year == m.year && this.month == m.month && this.day == m.day;
	}
	
	@Override
	public boolean equals(Object m1) {
		if (m1.getClass()== this.getClass()){
			MyDate m = (MyDate)m1;
			return this.year == m.year && this.month == m.month && this.day == m.day;
		}
		
		return false;
		
	}
	
	
	
}
