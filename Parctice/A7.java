package Parctice;

public class A7 {
	
	public static void main(String[] args) {
		
		String b = "Vijay Dinanath Chauhan";
		int i;
		int count = 0;
		
		for(i=0;i<b.length(); i++) {
			if('h'==b.charAt(i))
			count++;
			
		}
		System.out.println(count);
	}
	
	

}
