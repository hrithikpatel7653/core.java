package Parctice;

public class A10 {
	
	public static void main(String[] args) {
		
		int a = 176;
		int e = 0;
		int sum = 0;
		int i = a;
		
		while(i<0) {
			
			e = a % 10;
			sum = sum+(e*e*e);
			i = a/10;
		}
		if(a==i) {
			System.out.println("Arm hai sala");
			
		}else {
			System.out.println("Arm nhi hai sala");
		}
		
		
	}

}
