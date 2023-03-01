package Exercise;

import java.util.Random;

public class A3 {
	
	public static void main(String[] args) {
		
		Random rnum = new Random();
		System.out.println("Random Number :");
		int i;
		
		for(i = 1; i<=5; i++) {
			System.out.println(rnum.nextInt(100));
		}
	}

}
