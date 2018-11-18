//3.	Sa se implementeze o metoda care verifica daca un numar primit ca parametru este prim. 
//Un numar prim se divide exact doar cu 1 si cu el insusi.

package Teme3;

public class PrimeNumbers {
	public static void main(String[] args) {

		int n = 8;

		if (isPrime(n) == true) {
			System.out.println("Prime Number");
		} else {
			System.out.println("Not Prime Number");
		}
	}

	private static boolean isPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

}
