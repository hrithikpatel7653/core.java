package Array;

public class CopyAnArray {
	
	public static void main(String[] args) {
		
		char[]copyFrom = {'A','B','C','D','E','F'};
		char[]copyTo = new char[4];
		
		System.arraycopy(copyFrom, 2, copyTo, 1, 3);
		System.out.println(copyTo);
	}

}
