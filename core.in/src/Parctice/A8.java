package Parctice;

public class A8 {
	
	public static void main(String[] args) {
		
		String a = "jay jaya janki nayka";
		int i;
		int count = 0;
		
		for(i=0; i<a.length();i++) {
			if('h'==a.charAt(i))
			count++;
		}
		System.out.println(count);
		
	}

}
