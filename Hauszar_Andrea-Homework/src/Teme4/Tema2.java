//2. Sa se implementeze o metoda care primeste ca parametri doua siruri ordonate de numere si
//returneaza un sir ordonat compus din elementele celor doua siruri. 
//
//int[] sortedConcatenation(int[] sir1, int[] sir2) {...
//
//Exemplu: 
//sortedConcatenation({1,1,2,3,5}, {1,5,6,9}) => {1,1,1,2,3,5,5,6,9}
//sortedConcatenation({1,2,3}, {2,3,4}) => {1,2,2,3,3,4}

package Teme4;

import java.util.Arrays;

public class Tema2 {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 5 };
		int[] array = { 4, 6, 7, 8 };

		System.out.println(Arrays.toString(sortedConcatenation(arr, array)));

	}

	private static int[] sortedConcatenation(int[] arr, int[] array) {

		int lungimeArr = arr.length;
		int lungimeArray = array.length;

		int newArray[] = new int[lungimeArr + lungimeArray];

		System.arraycopy(arr, 0, newArray, 0, lungimeArr);
		System.arraycopy(array, 0, newArray, lungimeArr, lungimeArray);

		Arrays.sort(newArray);
		return newArray;
	}
}
