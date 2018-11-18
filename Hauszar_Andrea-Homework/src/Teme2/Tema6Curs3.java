package Teme2;
//6. Sa se implementeze o metoda care primeste ca parametru un sir de cifre intre 0 si 9 si returneaza numarul format din ele.

public class Tema6Curs3 {
	public static void main(String[] args) {

		int[] number = { 1, 6, 3, 4 };

		System.out.println(convert(number));
	}

	// 1234 = 1*1000 + 2*100 + 3*10 + 4
	private static int convert(int[] number) {
		int suma = 0;
		int valoareCifra = 1;
		for (int i = number.length - 1; i >= 0; i--) {
			int sumaCifrelor = number[i] * valoareCifra;
			suma += sumaCifrelor;
			valoareCifra *= 10;

		}
		return suma;

	}

}