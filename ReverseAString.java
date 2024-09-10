import java.util.Scanner;

public class ReverseAString {
	
	String Reverse(String s) {
	    int x = s.length() - 1;
	    String ns = "";
	    for (int i = x; i >= 0; i--) {
	        ns = ns + s.charAt(i);
	    }
	    return ns;
	}
	

	public static void main(String[] args) {
		ReverseAString o = new ReverseAString();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string to reverse: ");
		String s = in.nextLine();
		System.out.println("Reversed String: " + o.Reverse(s));
		String temp = s;
		if (s.equalsIgnoreCase(o.Reverse(s)))
		{
			System.out.println("The String Is A Palindrome.");
		}
		else 
		{
			System.out.println("The String Is Not A Palindrome");
		}
		
		
	}
}
