//Un vagon de pasageri este caracterizat printr-un id unic, o greutate in tone si un numar maxim de pasageri pe care ii poate gazdui.

package Teme7;

public class VagonPasageri {
	private int numarMaxPasageri;
	private int id;
	private double greutate;

	public VagonPasageri(int id, double greutate) {
		this.id = id;
		this.greutate = greutate;
	}

	public int getId() {
		return this.id;
	}

	public double getGreutate() {
		return this.greutate;
	}

	public void setGreutate(double greutate) {
		this.greutate = greutate;
	}

	public VagonPasageri(int id, double greutate, int numarPas) {
		this.id = id;
		this.greutate = greutate;
		this.numarMaxPasageri = numarPas;
	}

	public int getNumarPasageri() {
		return numarMaxPasageri;
	}

	public void setNumarPasageri(int nrpasageri) {
		this.numarMaxPasageri = nrpasageri;
	}

	@Override
	public String toString() {
		return " Vagon Pasageri: " + this.getId() + ", greutate: " + this.getGreutate() + " nr pasageri: "
				+ numarMaxPasageri;
	}

}