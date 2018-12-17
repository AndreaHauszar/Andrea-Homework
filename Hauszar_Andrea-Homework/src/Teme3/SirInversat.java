//6. Sa se implementeze o metoda care primeste ca parametru un sir de numere si returneaza sirul respectiv inversat

package Teme3;

import java.util.Arrays;

public class SirInversat {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

		int[] result = reverseArray(arr);
		System.out.println(Arrays.toString(result));

	}

	private static int[] reverseArray(int[] arr) {
		int backArray[] = new int[arr.length];

		for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
			backArray[j] = arr[i];

		}
		return backArray;
	}
}
