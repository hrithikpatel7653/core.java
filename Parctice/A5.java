package Parctice;

public class A5 {
	
	public static void main(String[] args) {
		
		boolean b = true;
		int i = 0;
		int sum = 0;
		
		while(b) {
			System.out.println("Hello "+i);
			sum = sum+i;
			i++;
			if(i>3) {
				b = false;
			}
		}
		System.out.println(sum);
		
	}

}
