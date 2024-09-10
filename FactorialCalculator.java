
public class FactorialCalculator {
	
	public static int calulateFactorial(int n) {


		// TODO Auto-generated method stub
		if (n == 0) {
			return 1;
		}
		return n * calulateFactorial(n - 1);
	}
	public static void main(String[] args) {
		int number = 7;
		int factorial = calulateFactorial(number);
		System.out.println("Factorial of " + number + " is: " + factorial);
		number = 12;
		factorial = calulateFactorial(number);
		System.out.println("\nFactorial of " + number + " is: " + factorial);
		
			
		}

	}


