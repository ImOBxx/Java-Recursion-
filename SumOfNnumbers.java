import java.util.Scanner;

public class SumOfNnumbers {

    int sumn(int n) {
        int sum = 0;
        if (n <= 1) {
            return 1;
        } else {
            return n + sumn(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        SumOfNnumbers x = new SumOfNnumbers();
        System.out.println("Enter Nth Number: ");
        n = in.nextInt();
        System.out.println("The Sum Of Numbers: " + x.sumn(n));
    }
}

		
	
