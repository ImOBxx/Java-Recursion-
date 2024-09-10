
public class PalindromeChecker {
	
	public static boolean isPalindrome(String str) {
		if (str.length() <= 1) {
			return true;
		}
		char firstChar = str.charAt(0);
		char lastChar = str.charAt(str.length() - 1);
		if (firstChar != lastChar) 
			if (firstChar != lastChar) { 
				return false;
			}
			String remainingSubString = str.substring(1, str.length() - 1);
			return isPalindrome(remainingSubString);
		
			
				
			}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palindrome1 = "madam";
		boolean isPalindrome1 = isPalindrome(palindrome1);
		System.out.println(palindrome1 + " is a palindrome: " + isPalindrome1);
		
		String palindrome2 = "level";
		boolean isPalindrome2 = isPalindrome(palindrome2);
		System.out.println(palindrome2 + " is a palindrome: " + isPalindrome2);
		
		String notPalindrome = "java";
		boolean isPalindrome3 = isPalindrome(notPalindrome);
		System.out.println(notPalindrome + " is a palindrome: " + isPalindrome3);
		

	}

}
