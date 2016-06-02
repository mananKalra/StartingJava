// toString() method

class next{
	private int date;
	private int month;
	private int year;
	public void setDate(int d, int m, int y){
		date = d;
		month = m;
		year = y;
		System.out.printf("The date is %s", this);
	}
	public String toString(){
		return String.format("%d/%d/%d", date, month, year);
	}
}