// total zile in an utilizand metoda creata cu switch
public class ZileAn {
	public static void main(String[] args) {

		int suma = 0;
		for (int months = 1; months <= 12; months++) {

			suma += getDaysOfMonths(months);

		}
		System.out.println(suma);
	}

	private static int getDaysOfMonths(int months) {
		switch (months) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return 31;
		case 2:
			return 28;
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		}
		return 0;
	}

}

// suma o pornim de la valoarea 0
// in loop adaugam cu ajutorul metodei create 
