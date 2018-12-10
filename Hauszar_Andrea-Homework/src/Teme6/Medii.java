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

		double mediaStudent1 = st1.getMedia();

		double mediaStudent2 = st2.getMedia();

		double mediaStudent3 = st3.getMedia();

		// am printat asa sa vad daca merge - pana aici merge :)
		System.out.println(mediaStudent1);
		System.out.println(mediaStudent2);
		System.out.println(mediaStudent3);
	}

}
