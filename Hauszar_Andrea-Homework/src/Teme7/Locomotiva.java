//Se va implementa o aplicatie de gestionare a unui depou.
//In depou se pot introduce locomotive, vagoane de pasageri si vagoane de marfa.
//O locomotiva este caracterizata printr-un id unic si o viteza maxima.   ------------- OK
//Un vagon de marfa este caracterizat printr-un id unic si o greutate in tone.
//Un vagon de pasageri este caracterizat printr-un id unic, o greutate in tone si un numar maxim de pasageri pe care ii poate gazdui.
//Cu ajutorul aplicatiei se vor putea introduce in depou locomotive si vagoane de ambele tipuri. De asemenea se pot construi trenuri cu o locomotiva si mai multe vagoane prezente in depou.
//
//Aplicatia va avea urmatoarele functionalitati:
//1. adaugare locomotiva in depou
//2. adaugare vagon marfa in depou
//3. adaugare vagon pasageri in depou
//4. creare tren (id si locomotiva)
//5. adaugare vagoane la tren (id)
//6. afisare trenuri (locomotiva, vagoanele componente si viteza maxima)
//7. creare automata tren (se introduce un numar de pasageri si un numar de tone si se genereaza un tren cu vagoanele componente care sa permita transportul descris)
//0. iesire
//
//Fiecare tren are si el un id unic in sistem. Dupa adaugarea fiecarui vagon se va calcula si afisa viteza maxima a trenului stiind ca fiecare tona a unui vagon scade viteza maxima cu 1 km/h, iar greutatea unui vagon de pasageri se calculeaza ca fiind greutatea vagonului gol + (0.07 * numarul de locuri).
//Nu se va mai permite adaugarea de vagoane daca viteza maxima scade sub 50km/h.
//Nu este necesar ca datele introduce sa ramana persistente intre doua rulari succesive ale programului.

package Teme7;

public class Locomotiva {
	private int id;
	private double vitezaMaxima;

	public Locomotiva(int id, double vitezaMax) {
		this.id = id;
		this.vitezaMaxima = vitezaMax;
	}

	public double getVitezaMaxima() {
		return this.vitezaMaxima;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return " Locomotiva: " + this.getId() + ", Viteza Maxima: " + this.getVitezaMaxima();

	}
}
