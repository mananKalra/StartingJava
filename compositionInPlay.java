// composition

public class composition {
	private String name;
	private next date;
	public void set(String x, next y){
		name = x;
		date = y;
	}
	public String toString(){
		return String.format("Name is %s and the date is %s\n", name, date);
	}
}

