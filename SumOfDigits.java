import java.util.Scanner;

public class SumOfDigits {
	
	int calc(int x)
	{ 
		int sum = 0;
		int r;
		while (x > 0)
		{
			r = x % 10;
			sum = sum + r;
			x = x / 10;
		}
		return sum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfDigits o = new SumOfDigits();
		Scanner in = new Scanner (System.in);
		int x;
		System.out.println("Enter Number: ");
		x = in.nextInt();
		System.out.println("Sum Of Digits: " + o.calc(x));
	
		

	}

}
