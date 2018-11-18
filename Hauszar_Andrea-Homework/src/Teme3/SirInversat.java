//6. Sa se implementeze o metoda care primeste ca parametru un sir de numere si returneaza sirul respectiv inversat

package Teme3;

import java.util.Arrays;

public class SirInversat {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		// int reverseArr = 1;

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
		System.out.println(Arrays.toString(arr)); // ???
	}
}
