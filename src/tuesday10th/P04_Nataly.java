package tuesday10th;

import java.util.Scanner;

public class P04_Nataly {


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		findCommonDividers(arr);
	}

	static void findCommonDividers(int[] arr) {
		int minElement = getMinElement(arr);
		findCommonDividersHelper(arr, 2, minElement);
	}

	private static void findCommonDividersHelper(int[] arr, int divider, int min) {
		if (divider <= min) {
			boolean isCommonDivider = true;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] % divider != 0) {
					isCommonDivider = false;
					break;
				}
			}
			if (isCommonDivider) {
				System.out.print(divider + " ");
			}
			findCommonDividersHelper(arr, divider + 1, min);
		}
	}

	static int getMinElement(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

}