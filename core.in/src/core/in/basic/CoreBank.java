package core.in.basic;

public class CoreBank {
	
	public void fundfransfer() {
		System.out.println("fund transfer sucessfull");
		
	}
	
	public void deposited(int amount) {
		System.out.println("deposited "+ amount);
	}
	
	public  void interest(int amount,int byaj) {
		int total = amount + byaj;
		
		System.out.println(total);
	}
	
	public static void max(int a,int b) {
		if(a>b) {
			System.out.println("a is greater");
		}
		else {
			System.out.println("b ia grater");
		}
		
		
		}
	      public int sum(int a, int b) {
	    	  int c = a+b;
	    	  return c;
	    	  
	      }
	     
}    	   
		
		
		
	
	
	
	


