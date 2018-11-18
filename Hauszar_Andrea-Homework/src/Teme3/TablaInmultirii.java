//8. Sa se implementeze o metoda care afiseaza tabla inmultirii pentru un numar primit ca parametru.
//Ex: pentru 6:
//6 x 1 = 6
//6 x 2 = 12
//...
//6 x 10 = 60

package Teme3;

public class TablaInmultirii {
	public static void main(String[] args) {

		int number = 6;

		for (int i = 1; i <= 10; i++) {
			System.out.println(number + " x " + i + " = " + number * i);
		}

	}
}
