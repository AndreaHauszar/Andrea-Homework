//7. Sa se implementeze o clasa Square care modeleaza un patrat si are ca proprietate o variabila side de tip int care reprezinta lungimea laturii patratului.
//Clasa va avea un constructor care va primi ca parametru lungimea laturii si o metoda getArea() care returneaza aria patratului. 
//Implementati o clasa SquareClient care creeaza 3 obiecte de tip Square si le afiseaza ariile cu ajutorul metodei getArea()

package Teme3;

public class Patrat {
	int lungimeLatura;

	public Patrat(int lungimeLatura) {
		this.lungimeLatura = lungimeLatura;
	}

	public int getArea() {

		return lungimeLatura * lungimeLatura;
	}
}
