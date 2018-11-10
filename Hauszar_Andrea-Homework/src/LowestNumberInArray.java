import java.util.Arrays;

//2. Sa se implementeze o metoda care returneaza numarul minim dintr-un sir de numere primit ca parametru.

public class LowestNumberInArray {
	public static void main(String[] args) {
		// inteligenta solutie dar as vrea s-o vad implementata intr-o metoda separata, si e discutabil daca e eficienta
		int[] arr = { 9, 8, 7, 6, 1, 2, 3, 4, 10, 11, 12, 0 };
		Arrays.sort(arr);
		System.out.println("Minim = " + arr[0]);
		System.out.println("Maxim = " + arr[arr.length - 1]);
	}
}

// am sortat Arrayul arr ->minumul este acum la Pozitia 0 arr[0]
//Maximul este pe ultima pozitie - din cauza ca incepe numaratoarea de la 0 ->punem la final -1
