package Teme2;
//5. Sa se implementeze o metoda care returneaza cate numere negative se gasesc intr-un sir de numere primit ca parametru.

public class NumereNegativeInArray {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 0, 3, -4, -9, -13, 4, 5 };

		int negativeCounter = NegativeCounter(arr);
		System.out.println(negativeCounter);
	}

	private static int NegativeCounter(int[] arr) {
		int negativeCounter = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 0) {
				continue;
			}

			negativeCounter++;

		}
		return negativeCounter;
	}
}

//am eliminat cu if numerele mai mari sau egale cu 0
//am creat o variabila care incepe de la 0
//cand gaseste numere mai mici ca 0 le ia in considerare
