package Day3Array;

public class ArrayInReverseOrder {
	public static void main(String[] args) {

		int[] arr = new int[] { 10, 20, 30, 40, 50 };
		System.out.println("Array in sequence: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Array in reverse order: ");
		
		// Loop for the array in reverse order
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}
}
