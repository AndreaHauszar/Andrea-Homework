//3. Sa se implementeze o clasa care simuleaza un minicalculator.
//Numele clasei este Calculator.
//Ca variabila membru in interiorul clasei avem valoarea curenta.
//In clasa exista urmatoarele metode:
//  - un constructor cu un parametru care initializeaza valoarea curenta cu valoarea parametrului
//  - un constructor fara parametru care initializeaza valoarea curenta cu 0
//  - o metoda void add(int n) care va aduna la valoarea curenta valoarea primita ca parametru
//  - o metoda void subtract(int n) care va scadea din valoarea curenta valoarea primita ca parametru    
//  - o metoda void multiply(int n) care va inmulti valoarea curenta cu numarul primit ca parametru
//  - o metoda void display() care va afisa valoarea curenta
//Dupa implementarea acestei clase implementati o clasa CalculatorClient care demonstreaza functionalitatea clasei de mai sus
//creand un obiect de tip calculator si apelandu-i metodele.

package Teme5;

public class Calculator {

	private int valoareCurenta;

	public Calculator(int initialValue) {
		this.valoareCurenta = initialValue;
	}

	public int getValoareCurenta() {
		return valoareCurenta;
	}

	public void setValoareCurenta() {
		this.valoareCurenta = 0;
	}

	public void add(int n) {
		valoareCurenta += n;

	}

	public Calculator() {
		this.valoareCurenta = 0;
	}

	public void substract(int n) {
		valoareCurenta -= n;
	}

	public void multiply(int n) {
		valoareCurenta *= n;
	}

	public void display() {
		System.out.println(valoareCurenta);
	}

}
