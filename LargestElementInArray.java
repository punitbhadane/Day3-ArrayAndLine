package Day3Array;

public class LargestElementInArray {

	public static void main(String[] args) {
		// initialized array
		int[] arr = new int[] { 10, 80, 55, 81, 92 };

		int large = arr[0];
		// For loop for search a largest array
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > large)
				large = arr[i];
		}
		System.out.println("Largest element present in given array is: " + large);
	}

}
