//Dupa implementarea acestei clase implementati o clasa CalculatorClient care demonstreaza functionalitatea clasei de mai sus
//creand un obiect de tip calculator si apelandu-i metodele.

package Teme4;

public class CalculatorClient {
	public static void main(String[] args) {
		Calculator c1 = new Calculator(5);
		Calculator c2 = new Calculator(2);
		Calculator c3 = new Calculator(10);

		c1.add(10);
		c2.multiply(10);
		c3.substract(5);

		c1.didplay();
		c2.didplay();
		c3.didplay();
	}
}
