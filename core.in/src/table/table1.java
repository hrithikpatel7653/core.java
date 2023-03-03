package table;

public class table1 {
	
	public static void main(String[] args) {
		
		int[] table = new int[10];
		//table[0] = 2;
		//table[1] = 4;
		//table[2] = 6;
		//table[3] = 8;
		//System.out.println(table[2]);
		
		for(int i = 0; i<=table.length; i++) {
			table[i] = 2*i;
			System.out.println(table[i]);
		}
		
	}

}
