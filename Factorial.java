import java.util.Scanner;

public class Factorial {
	
	int fact(int n)
	{
		if (n <= 1)
		{
			return 1;
		}
		else
		{
			return n * fact(n - 1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in  = new Scanner (System.in);
		Factorial x  = new Factorial(); 
		int n;
		System.out.println("Enter Number: ");
		n = in.nextInt();
		System.out.println("The Facotrial Of " + n + " : " + x.fact(n));

	}

}

