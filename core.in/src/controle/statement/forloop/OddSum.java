package controle.statement.forloop;

public class OddSum {
	
	public static void main(String[] args) {
		
		int i;
		int sum = 0;
		
		for(i = 1; i<=10; i = i+2) {
			
			System.out.println(i);
			
			sum = sum + i;
			
		}
		System.out.println(sum);
		    
	}

}
