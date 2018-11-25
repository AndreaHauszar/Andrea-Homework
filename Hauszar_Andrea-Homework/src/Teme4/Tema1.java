//1. Sa se implementeze o metoda care returneaza dimensiunea celei mai lungi secvente de numere egale dintr-un sir de numere primit ca parametru.
//
//int longestSeq(int[] sir) { ...
//
//Example: 
//longestSeq({1, 1, 2, 3, 5, 1, 5, 6, 9}) => 2
//longestSeq ({1, 2, 3, 2, 3, 4}) => 1
//longestSeq ({1, 1, 1, 2, 2, 3, 3, 3, 3, 2, 3, 4}) => 4

package Teme4;

public class Tema1 {
	public static void main(String[] args) {

		int[] sir = { 1, 1, 1, 1, 2, 3, 3, 1, 5, 6, 9 };

		System.out.println(longestSeq(sir));
	}

	private static int longestSeq(int[] array) {
		int counter = 1, max = 1;
		for (int i = 1; i < array.length; i++) {
			if (array[i] == array[i - 1]) {
				counter++;
				if (counter > max) {
					max = counter;
				}

			} else {
				counter = 1;
			}

		}
		return max;

	}
}
