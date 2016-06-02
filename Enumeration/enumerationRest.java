// enumeration

enum next{
	
	Abcd("Life","1996"),
	Efgh("Love","2012"),
	Ijkl("Dreams","2016"),
	Mnop("Reality","Now");
	
	private String desc;
	private String year;
    next(String description, String start){
		desc = description;
		year = start;
	}
	public String getDesc(){
		return desc;
	}
	public String getYear(){
		return year;
	}
}