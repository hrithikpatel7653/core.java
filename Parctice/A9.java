package Parctice;

public class A9 {
	
	public static void main(String[] args) {
		
		int n = 153;
		int o = 0;
		int sum = 0;
		int r = n;
		
		while(n>0) {
			
			o = n % 10;
			sum = sum+(o*o*o);
			r = n/10;
        }
		 if(sum==n) {
			 System.out.println("Arm");
		 }else {
			 System.out.println("Arm Not");
		 }
		
		
		
		
	}

}
