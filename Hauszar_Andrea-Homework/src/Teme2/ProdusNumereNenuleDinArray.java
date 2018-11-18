package Teme2;
//4. Sa se implementeze o metoda care returneaza produsul numerelor nenule dintr-un sir de numere primit ca parametru.

public class ProdusNumereNenuleDinArray {
	public static void main(String[] args) { // care era shortcutul pt linia aceasta?

		int[] arr = { 1, 2, 0, 3, 4, 5 };
		int produs = Produs(arr);
		System.out.println("Rezultat multiplicare: " + produs);
	}

	private static int Produs(int[] arr) {
		int produs = 1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				continue;
			}
			produs *= arr[i];
		}
		return produs;
	}
}

//acelasi lucru ca si la suma - cream o variabila noua = 1 (pt ca facem un produs)
//adaugam in loop un if - pentru a skipui o valoare de 0 din array
//tot in loopul de for adaugam calculul
//printam in exteriolul loopului