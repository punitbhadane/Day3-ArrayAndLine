package Day3Array;

public class SecondLargestNumberInArray {
	public static int getSecondLargest(int[] a, int total) {
		int sub;
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (a[i] > a[j]) {
					sub = a[i];
					a[i] = a[j];
					a[j] = sub;
				}
			}
		}
		return a[total - 2];
	}

	public static void main(String args[]) {
		int a[] = { 10, 12, 5, 17, 15, 2 };
		System.out.println("Second Largest: " + getSecondLargest(a, 6));
	}
}
