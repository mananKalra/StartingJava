// time class

class fourth{
	public static void main(String[] args){
		int h, m, s;
		militaryTime(24, 60, 32);
		regularTime(13,45,34);
	}
	
	public static void militaryTime(int h, int m, int s){
		h = ((h>0 && h<24) ? h : 0);
		m = ((m>0 && m<60) ? m : 0);
		s = ((s>0 && s<60) ? s : 0);
		System.out.printf("%02d:%02d:%02d", h, m, s);
		System.out.println();
	}
	
	public static void regularTime(int h, int m, int s){
		System.out.println(String.format("%d:%02d:%02d %s", (h==0||h==12)?12:h%12, m, s, (h<12)?"AM":"PM"));
	}
}