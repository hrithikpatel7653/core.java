package Array;

public class CommandLineMenu {
	
	public static void main(String[] args)throws Exception{
		
		int ch = System.in.read(); //Read data from Keyboard
		System.out.println("Selected char ASCII Code "+ch);
		
		if(ch=='A' || ch=='a'){
			CommandLineMenu add = new CommandLineMenu(); 
			add.main(args);
		} else if(ch=='D' || ch=='d') {
			Division.main(args);
		}else {
			System.out.println("Incorrect Choice");
		}
		
		
	}

}
