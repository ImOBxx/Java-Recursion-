
public class RecursionIsCool {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countBackwards(14);
		

	}

	private static void countBackwards(int n) {
		// TODO Auto-generated method stub
		
	


		// TODO Auto-generated method stub
		if (n == 12) {
			System.out.println("Done!");
		} else {
			System.out.println(n);
			n--;
			countBackwards(n);
			
		}
		
	}

}
