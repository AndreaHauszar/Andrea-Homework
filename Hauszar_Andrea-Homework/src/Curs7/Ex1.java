//metoda care pimeste ca parametru  2 numere intregi a si b si returneaza a/b iar daca b=0 returneaza -1

package Curs7;

public class Ex1 {
	public static void main(String[] args) {
		Ex1 e = new Ex1();
		System.out.println(e.division(8, 5));

	}

	private int division(int a, int b) {

		if (b == 0) {
			return -1;
		}

		return a / b;

	}
}
