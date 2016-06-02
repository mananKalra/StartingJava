// variable length arguments

class third{
	public static void main(String[] args){
		System.out.println(average(1,2,3,4,5,6,7,8,9));
	}
	
	public static double average(double...numbers){
		double total = 0;
		for(double x : numbers){
			total += x;
		}
		return total/numbers.length;
	}
}