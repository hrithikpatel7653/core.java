package table;

public class table5 {
	
	public static void main(String[] args) {
		
		int[][] tab = new int[20][20];
		int i,j;
		for(i = 1; i<tab.length; i++) {
			for(j = 10; j<tab.length; j++) {
				tab[i][j] = 2*i;
				System.out.print(i*j+"\t");
			}
			System.out.println();
		}
	}

}
