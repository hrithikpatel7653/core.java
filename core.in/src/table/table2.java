package table;

public class table2 {
	
	public static void main(String[] args) {
		
		int[][] table = new int[10][10];
		int i,j;
		//int count = 0;
		
		for(i = 1; i<=table.length-1; i++) {
			for(j = 1; j<=table.length-1; j++) {
				table [i][j] = i*j;
				System.out.print(i*j+"\t");
			}
				
			System.out.println();	
		}
		
		
		
		
	}

}
