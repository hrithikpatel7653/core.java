package Loop;

public class Vijay {
	public static void main(String[] args) {
		
		String name = "Vijay Dinanath Chauhan";
		
		System.out.println(name.length());
		System.out.println(name.charAt(7));
		System.out.println(name.indexOf("nath"));
		System.out.println(name.indexOf("a"));
		System.out.println(name.lastIndexOf("a"));
		System.out.println(name.replace("a","z"));
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.startsWith("Vijay"));
		System.out.println(name.endsWith("han"));
		System.out.println(name.substring(0));
		
		
		for(char c = 'a'; c<='z'; c++) {
			System.out.print(c);
		}
	}

}
