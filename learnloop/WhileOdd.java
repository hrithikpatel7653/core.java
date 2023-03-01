package learnloop;

public class WhileOdd {
	
	public static void main(String[] args) {
		
		boolean b = true;
		int i = 1;
		//int sum = 0;
		
		while(b) {
			System.out.println("Odd " + i);
			//sum = sum+i;
			i = i+2;
			if(i>=20) {
				b = false;
				
			}
			
			
		}
		//System.out.println("Odd no.sum "+ sum);
	}

}
