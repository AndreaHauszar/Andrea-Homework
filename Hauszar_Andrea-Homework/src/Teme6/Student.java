//1. Sa se implementeze o clasa numita Student cu:
//  - 3 variabile membru: nume, nota1, nota2
//  - 1 constructor cu parametrii nume, nota1, nota2
//  - o metoda getMedia care returneaza media pentru un student ca fiind suma notelor / 2
//Sa se implementeze o clasa cu un program care construieste o lista de minim 3 studenti, si afiseaza clasamentul acestora in ordinea mediilor.

package Teme6;

public class Student {
	private String nume;
	private int nota1;
	private int nota2;

	Student(String name, int grade1, int grade2) {
		this.nume = name;
		this.nota1 = grade1;
		this.nota2 = grade2;
	}

	String getName() {
		return nume;
	}

	double getMedia() {
		return (nota1 + nota2) / 2;
	}

}
