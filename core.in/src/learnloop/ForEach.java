package learnloop;

public class ForEach {
	
	public static void main(String[] args) {
		
		int[] a = {2,4,6,8,10};
		int sum = 0;
		
		
		 for(int j:a) {
			System.out.println(j);
			sum = sum+j;
		} 
		    int b = a.length;
		
		System.out.println("Total no.sum "+ sum);
		System.out.println("Total length "+ b);
	}

}
