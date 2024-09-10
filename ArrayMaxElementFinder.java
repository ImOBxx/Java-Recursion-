import java.util.Arrays;

public class ArrayMaxElementFinder {
	
	public static int findMaxElement(int[] arr) {
		return findMaxElement(arr, 0, arr.length - 1);
	}
	
	private static int findMaxElement(int[] arr, int left, int right) {
		if (left == right) {
			return arr[left];
		}
	int mid = (left + right) / 2;
	int maxLeft = findMaxElement(arr, left, mid);
	int maxRight = findMaxElement(arr, mid + 1, right);
	return Math.max(maxLeft, maxRight);
	}
	
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {
				34,
				45,
				34,
				23,
				56,
				62,
				27,
				55
		};
		System.out.println("Original Array: " + Arrays.toString(array));
		int maxElement = findMaxElement(array);
		System.out.println("the maximum element in the array is: " + maxElement);
		}

	}


