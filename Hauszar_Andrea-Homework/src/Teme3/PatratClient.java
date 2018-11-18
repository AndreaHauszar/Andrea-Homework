//7. Sa se implementeze o clasa Square care modeleaza un patrat si are ca proprietate o variabila side de tip int care reprezinta lungimea laturii patratului.
//Clasa va avea un constructor care va primi ca parametru lungimea laturii si o metoda getArea() care returneaza aria patratului. 
//Implementati o clasa SquareClient care creeaza 3 obiecte de tip Square si le afiseaza ariile cu ajutorul metodei getArea()

package Teme3;

public class PatratClient {
	public static void main(String[] args) {
		Patrat p1 = new Patrat(6);
		Patrat p2 = new Patrat(7);
		Patrat p3 = new Patrat(8);

		p1.getArea();
		p2.getArea();
		p3.getArea();

	}
}
