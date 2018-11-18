package Teme2;

import java.util.Arrays;

//2. Sa se implementeze o metoda care returneaza numarul minim dintr-un sir de numere primit ca parametru.

public class LowestNumberInArray {
	public static void main(String[] args) {

		int[] arr = { 1, 4, 3, 8, 9, 0 };
		Arrays.sort(arr);
		System.out.println("Minim = " + arr[0]);
		System.out.println("Maxim = " + arr[arr.length - 1]);

		// private static int min(int[]numbers{
		// int min = numbers[0];
		// for(int nr: numbers) {
		// if (min > nr) {
		// min=nr;
		// }
		// }
	}
}

// am sortat Arrayul arr ->minumul este acum la Pozitia 0 arr[0]
//Maximul este pe ultima pozitie - din cauza ca incepe numaratoarea de la 0 ->punem la final -1