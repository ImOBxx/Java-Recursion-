import java.util.Scanner;

public class FibonacciSeries {
	
    public static int fibonacci(int n) {
	
	{
		if (n == 0)
		{
			return 0;
		}
		else if (n == 1)
		{
			return 1;
		}
		else
		{
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
		
	}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int n;
		System.out.println("Enter Nth Term: ");
		n = in.nextInt();
		System.out.println("The Fibonacci Number In The Nth Term: " + fibonacci(n));

	}

}

