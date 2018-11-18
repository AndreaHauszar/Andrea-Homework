package Teme2;

public class NumberConverter {
	public static void main(String[] args) {

		int[] number = { 1, 6, 3, 4 };

		reverse(number);

		System.out.println(convert(number));
	}

	private static void reverse(int[] array) {
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println(array[i]);
		}

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
//private static void show10() {
//int numere = 1;
//for (int i = 1; i <= 5; i++) {
//	System.out.println(numere);
//	numere *= 10;