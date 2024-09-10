import java.util.ArrayList;
import java.util.List;

public class StringPermutationGenerator {
	
	
	public static List < String > generatePermutations(String str) {
		List < String > permutations = new ArrayList < > ();
		generatePermutationsHelper(str, "", permutations);
		return permutations;
	}
	
	private static void generatePermutationsHelper(String str, String current, List < String > permutations) {
		if (str.isEmpty()) {
			permutations.add(current);
			return;
		}
	
	
	for (int i = 0; i < str.length(); i++) {
		char ch = str.charAt(i);
		String remaining = str.substring(0, i) + str.substring(i + 1);
		generatePermutationsHelper(remaining, current + ch, permutations);
	}
	}

	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "abc";
		List < String > permutations = generatePermutations(input);
		System.out.println("Permuations of \"" + input + "\":");
			for (String permutation: permutations) {
				System.out.println(permutation);
			}
			}

	} 

