//4. Sa se implementeze o metoda care verifica daca 3 numere primite ca parametru verifica teorema lui Pitagora

//(a*a+b*b=c*c)

package Teme5;

public class TeoremaPitagora {
	public static void main(String[] args) {

		int a = 3;
		int b = 4;
		int c = 5;

		System.out.println(checkPitagora(a, b, c));

	}

	private static int checkPitagora(int a, int b, int c) {

		if (a * a + b * b == c * c) {
			return 1;
		}
		return 0;
	}
}
