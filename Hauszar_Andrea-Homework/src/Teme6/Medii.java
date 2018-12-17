//1. Sa se implementeze o clasa numita Student cu:
//  - 3 variabile membru: nume, nota1, nota2
//  - 1 constructor cu parametrii nume, nota1, nota2
//  - o metoda getMedia care returneaza media pentru un student ca fiind suma notelor / 2
//Sa se implementeze o clasa cu un program care construieste o lista de minim 3 studenti, si afiseaza clasamentul acestora in ordinea mediilor.

package Teme6;

public class Medii {
	public static void main(String[] args) {

		Student st1 = new Student("Dr", 2, 7);
		Student st2 = new Student("Sigmund", 7, 10);
		Student st3 = new Student("Freud", 3, 9);

		Student[] studenti = { st1, st2, st3 };

		Student x;

		for (int i = 0; i < studenti.length; i++) {
			for (int j = 1; j < (studenti.length - i); j++) {
				if (studenti[j - 1].getMedia() > studenti[j].getMedia()) {

					x = studenti[j - 1];
					studenti[j - 1] = studenti[j];
					studenti[j] = x;

				}
			}
		}

		for (int i = 0; i < studenti.length; i++) {
			System.out.println("Nume: " + studenti[i].getName() + "\n" + "Media: " + studenti[i].getMedia());
		}

	}

}
