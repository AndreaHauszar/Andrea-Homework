//2. Sa se realizeze o metoda care primeste ca parametru un numar si il afiseaza folosind caracterele _ si | sub forma:

// __      __  __      __  __  __  __  __ 
//|  |   | __| __||__||__ |__    ||__||__|
//|__|   ||__  __|   | __||__|   ||__| __|

package Teme5;

public class AfisareNumere {
	String[][] data = { { //
			"__", //
			"|  |", //
			"|__|" },

			{ " ", //
					"|", //
					"|" },
			{ "__", "__|", "|__" }

	};

	public static void main(String[] args) {
		// char ch = '0';
		// System.out.println((byte) ch);
		// ch++;
		// System.out.println((byte) ch);

		AfisareNumere display = new AfisareNumere();
		display.showNumber(0010101);

	}

	private void showNumber(int n) {
		String s = "" + n;

		for (int slice = 0; slice < 3; slice++) {

			for (char ch : s.toCharArray()) {
				int digit = ch - 48;
				// digit va fi o valoare intre 0 - 9
				System.out.print(data[digit][slice]);
			}
			System.out.println();
		}
	}
}
