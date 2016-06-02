// enumeration

import java.util.EnumSet;

class random{
	public static void main(String[] args){
		for(next people : next.values()){
			System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
		}
		System.out.println("\n\n");
		for(next people : EnumSet.range(next.Abcd, next.Ijkl)){
			System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
		}
	}
}