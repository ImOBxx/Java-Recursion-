import java.util.Scanner;

public class DigitSumCalc {
	
	int calc(int x)
	{
		if (x < 10)
		{
			return x;
		}
		else
		{
			int r;
			int sum = 0;
			r = x % 10;
			x = x / 10;
		
		return r + calc(x);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DigitSumCalc o = new DigitSumCalc();
		Scanner in = new Scanner (System.in);
		int x;
		System.out.println("Enter Number: ");
		x = in.nextInt();
		System.out.println("Sum Of Digits: " + o.calc(x));
		
		
		
		

	}

}
