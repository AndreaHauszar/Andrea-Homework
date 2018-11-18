//4.	Sa se implementeze o metoda care calculeaza cel mai mic multiplu comun (cmmmc) a doua numere 
//a si b primite ca parametru. cmmmc este cel mai mic numar care se imparte exact la a si b.

package Teme3;

public class CMMMC {
	public static void main(String[] args) {

		int a = 2;
		int b = 7;

		findCmmmc(a, b);
	}

	private static void findCmmmc(int a, int b) {
		int cmmmc = (a > b) ? a : b;
		while (true) {
			if (cmmmc % a == 0 && cmmmc % b == 0) {
				break;
			}
			cmmmc++;

		}
		System.out.println(cmmmc);
	}

}
