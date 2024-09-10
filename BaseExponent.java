import java.util.Scanner;

public class BaseExponent {
	
	int exbase(int b, int x) {
		if (x == 0) {
			return 1; // Anything raised to power 0 is 1
		} else {
			return b * exbase(b, x - 1); // Recursively multiply b by itself x times
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BaseExponent o = new BaseExponent();
		int b;
		int x;
		System.out.println("Enter Base: ");
		b = in.nextInt();
		System.out.println("Enter Exponent: ");
		x = in.nextInt();
		System.out.println("Calculation Of Exponents: " + b + " to the power of " + x + " = " + o.exbase(b, x));
	}
}
