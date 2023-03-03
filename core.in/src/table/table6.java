package table;

import java.text.SimpleDateFormat;
import java.util.Date;

public class table6 {
	
	public static void main(String[] args) {
		
		Date today= new Date();
		System.out.println(today);
		
 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
 String s = sdf.format(today);
 System.out.println(s);

	}

}
