//3. Sa se implementeze o metoda care returneaza media aritmetica a numerelor dintr-un sir de numere primit ca parametru.

public class MedieAritmeticaArray {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 0, 3, 4, 5 };
		float suma = Suma(arr); 
		System.out.println("Suma: " + suma);
		System.out.println("Medie: " + suma / arr.length);

	}

	// atentie la code conventions la numele metodei! trebuie cu litera mica
	// de asemenea metoda nu face media ci face suma si media o calculezi in exterior
	// as vrea o metoda care returneaza direct media
	private static float Suma(int[] arr) {
		float suma = 0;
		for (int i = 0; i < arr.length; i++) {
			suma += arr[i];
		}
		return suma;
	}
}

//trebuie sa mai recapitulam functia "for" - nu imi este clara -> nu inteleg cum interactioneaza 
//inteleg ca "for" trece prin toate numerele - loop
//ce nu inteleg este cum il folosesti

//am inteles foarte greu faptul ca a trebuit sa creez o variabila noue "suma" pentru a aduaga la ea numerele din array cu sirul de for
//si ca  daca suma += arr[i]; este in loop, va calcula singur - si ca trebuie printat dupa ce loopul si calculul este finalizat
