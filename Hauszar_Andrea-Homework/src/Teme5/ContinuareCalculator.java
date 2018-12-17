//1. Pornind de la problema cu calculatorul de la sesiunea precedenta sa se realizeze o aplicatie care poate fi folosita ca

//un calculator, respectiv, intr-o bucla asteapta de la utilizator o comanda alcatuita dintr-un operator urmat de un operand
//si afiseaza rezultatul operatiei respective.
//Sa se adauge operatia = care reinitializeaza currentValue cu o valoare
//Exemplu de utilizare:
//0
//+25
//25
//-7
//18
//*2
//36
//=0
//0

package Teme5;

import java.util.Scanner;

public class ContinuareCalculator {
	public static void main(String[] args) {

		Calculator calc = new Calculator();
		Scanner in = new Scanner(System.in);

		while (true) {
			calc.display();
			String line = in.nextLine(); // "+10"

			char operator = line.charAt(0);

			if (operator == 'x') {
				break;
			}
			int operand = Integer.parseInt(line.substring(1));

			switch (operator) {
			case '+':
				calc.add(operand);
				break;
			case '-':
				calc.substract(operand);
				break;
			case '*':
				calc.multiply(operand);
				break;
			default:
				System.out.println("Invalid input");

			}

		}

	}
}
