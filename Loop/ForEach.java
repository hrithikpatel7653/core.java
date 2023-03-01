package Loop;

public class ForEach {
	
	public static void main(Store[] args) {
		
		int[] i = {1,2,3,4};
		int sum = 0;
		
		
		for(int j:i) {
			System.out.println(j);
			
			sum = sum+j;
			}
		
		System.out.println(sum); 
		
}

}
