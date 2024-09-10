
public class StringLengthCalculator {
	
	public static int calculateStringLength(String str) {
		if (str.isEmpty()) {
			return 0;
		}
		return 1 + calculateStringLength(str.substring(1));
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Java Exercise!";
		int length = calculateStringLength(input);
		System.out.println("The length of the string \"" + input + "\" is: " + length);
		

	}

}
