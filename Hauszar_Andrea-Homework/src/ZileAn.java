import java.util.Scanner;

public class ZileAn {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// afisam cate zile are o luna de la 1-12
//		System.out.print("Luna: ");
//		int luna = in.nextInt();

		for (int luna = 1; luna <= 12; luna++) {
			System.out.print(luna + " - "); // syso (luna + " - " lunileInZile(luna));
			LunileInZile(luna);
		}

//		LunileInZile(luna);
//am creat switchurile de mai jos in metoda 
	}

//case poate fi doar numar limitat (nu double, nu long), valori intregi, 
	private static void LunileInZile(int luna) { // in loc de void punem void
		switch (luna) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31 Zile"); // sau scriem return 31
			break;
		case 2:
			System.out.println("28 Zile");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30 Zile");
			break;
		}
		// mai trebuie sa adaugam si return 0 la final
	}

	// Exercitiu
	// sa adunam zilele lunii - totalZileAn
	//
	// for (int luna = 1; luna <=12; luna++)
	//
	//
	//

// nu mai introducem nimic de la tastatura
// vrem sa ne afiseze toate lunile 1-31, 2-28...

}
