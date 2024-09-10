
public class GCDCalculator {
	
	public static int calculateGCD(int num1, int num2) {
		if (num2 == 0) {
			return num1;
		}
	int remainder = num1 % num2;
	return calculateGCD(num2, remainder);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1 = 16;
		int number2 = 18;
		int gcd = calculateGCD(number1, number2);
		System.out.println("The GCD of " + number1 + " and " + number2 + " is: " + gcd);

	}

}
