package Parctice;

public class A3 {
	
	public static void main(String[] args) {
		
		boolean b = true;
		int i = 10;
		while(b) {
			System.out.println("Hello "+i);
			i--;
			if(i<1) {
				b = false;
			}
		}
		
		
	}

}
