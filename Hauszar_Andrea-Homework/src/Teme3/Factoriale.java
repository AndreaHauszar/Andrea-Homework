//1.	Sa se implementeze o metoda care returneaza factorialul unui numar n primit ca parametru. 
//Factorialul unui numar n se calculeaza ca 1 x 2 x 3 x .... x n

package Teme3;

public class Factoriale {
	public static void main(String[] args) {
		int n = 5;
		int rezultatFactorial = calculFactorial(n);
		System.out.print("n! = ");
		System.out.println(rezultatFactorial);
	}

	private static int calculFactorial(int n) {
		int rezultatFactorial = 1;
		for (int i = 1; i <= n; i++) {
			System.out.println(i);

			// rezultatFactorial = n * (n - 1) * (n - 2) * (n - 3) * (n - 4);
			// formula daca stim cat e "n"

			rezultatFactorial *= i;

		}
		return rezultatFactorial;
	}
}
