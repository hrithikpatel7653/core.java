package table;

public class table3 {
	
	public static void main(String[] args) {
		
		int[][] table = new int [20][20];
		int i,j;
		
		for(i = 10; i<21; i++) {
			for(j = 1; j<11; j++) {
				table[i][j] = 2*i;
				System.out.print(i*j+"\t");
			}
			System.out.println();
		}
		
		
	}

}
