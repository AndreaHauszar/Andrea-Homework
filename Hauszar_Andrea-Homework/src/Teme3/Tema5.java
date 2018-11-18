/*Sa se implementeze o metoda care primeste ca parametri un sir de numere a si un numar n. 
Metoda cauta prima aparitie a numarului n in sirul a si cand il gaseste returneaza urmatorul 
numar din sir. Daca numarul cautat este pe ultima pozitie atunci metoda va returna -2, iar daca 
numarul cautat nu exista metoda va returna -1.
*/
package Teme3;

public class Tema5 {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int n = 5;

		System.out.println(searchNumber(arr, n));

	}

	private static int searchNumber(int[] arr, int n) {

		int counter = 0;

		for (int i = 0; i < arr.length; i++) {
			counter++;

			if (arr[i] == n) {
				if (counter == arr.length) {
					return -2;
				} else {
					return arr[++i];
				}
			}
		}
		return -1;

	}
}
