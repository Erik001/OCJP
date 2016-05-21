package collectionspractices.sorted;

public class MyDate implements Comparable<MyDate> {
	private int day;
	private int month;
	private int year;

	public MyDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public int compareTo(MyDate date) {
		if (this.year > date.year) {
			return 1;
		} else if (this.year == date.year) {
			if (this.month > date.month) {
				return 1;
			} else if (this.month == date.month) {
				if (this.day > date.day)
					return 1;
				else if(this.day == date.day)
					return 0;
				else return -1;
			}else{
				return -1;
			}
		} else {
			return -1;
		}
	}

	@Override
	public String toString() {
		return day + "/" + month + "/" + year;
	}

}
