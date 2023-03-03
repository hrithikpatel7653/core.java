package learnloop;

public class WhileEven {
	
	public static void main(String[] args) {
		
	boolean b = true;
	int i = 0;
	//int sum = 0;
	
	while(b) {
		System.out.println("even "+ i);
		//sum = sum+i;
		i = i+2;
		if(i>20) {
	    	  b = false;
		}
		
	      
		}
	//System.out.println("Even no.sum = "+ sum);
			
	}
}
