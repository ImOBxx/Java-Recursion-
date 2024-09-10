
public class ArrayElementCounter {
	
	public static < T > int countOccurences(T[] arr, T target) {
		return countOccurences(arr, target, 0);
	}
	private static < T > int countOccurences(T[] arr, T target, int index) {
		if (index == arr.length) {
			return 0;
		}
	int count = countOccurences(arr, target, index + 1);
	if (arr[index].equals(target)) {
		count++;
	}
    return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] numbers = {
				10,
				20,
				30,
				40,
				20,
				50,
				20,
				60
		};
		int target = 20;
		int occurences = countOccurences(numbers, target);
		System.out.println("The number of occurences of " + target + " is the array is: " + occurences);
		}

	}


