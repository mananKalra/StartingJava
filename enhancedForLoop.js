// ehanced for loop

class second{
	public static void main(String[] args){
		int arr[] = {1, 2, 3, 4, 5};
		int total = 0;
		for(int x : arr){
			total+=x;
		}
		// x stores the value as it loops through the array
		System.out.println(total);
	}
}