// array elements as counters

import java.util.Scanner;
import java.util.Ramdom;

class first{
	public static void main(String[] args){
		Random dice = new Random();
		int freq = new int[7];
		for(int i=0;i<1000;i++){
			++freq[1 + dice.nextInt(6)];
		}
		System.out.println("Counter\tFrequency");
		for(int counter=0;counter<freq.length;counter++){
			System.out.println(counter+"\t"+freq[counter]);
		}
	}
}