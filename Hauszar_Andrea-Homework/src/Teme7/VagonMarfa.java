//Un vagon de marfa este caracterizat printr-un id unic si o greutate in tone.

package Teme7;

public class VagonMarfa {
	private int id;
	private double greutate;

	public VagonMarfa(int id, double greutate) {
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

	// reprezentarea valorilor
	@Override
	public String toString() {
		return " Vagon Marfa: " + this.getId() + ", Greutate: " + this.getGreutate();

	}
}
