
public class ArrayProductCalculator {
	
	public static int calculateProduct(int[] arr) {
		return calculatePrduct(arr, 0, arr.length - 1);
	}
	private static int calculatePrduct(int[] arr, int left, int right) {
		if (left == right) {
			return arr[left];
		}
		int mid = (left + right) / 2;
		int productLeft = calculatePrduct(arr, left, mid);
		int productRight = calculatePrduct(arr, mid + 1, right);
		return productLeft * productRight;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {
				1,
				3,
				5,
				7
		};
		int product = calculateProduct(array);
		System.out.println("The product of all numbers in the array is: " + product);
		}

	}


