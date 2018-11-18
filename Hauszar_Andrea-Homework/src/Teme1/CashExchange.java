package Teme1;
import java.util.Scanner;

public class CashExchange {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduceti Cusrul Valutar Euro:");
		float CursValutar = scanner.nextFloat();
		System.out.print("Introduceti O Suma In Euro:");
		int SumaEuro = scanner.nextInt();

		System.out.println(+CursValutar + " RON/Euro *" + SumaEuro + " Euro = " + (CursValutar * SumaEuro) + " RON");

		System.out.print("Valoare In Ron:");
		System.out.print(CursValutar * SumaEuro);
		System.out.print(" RON");

	}
}
//cursvalutar si suma euro = afiseaza suma in ron care reprezinta suma respectiva in reuro
//se adauga inca o valoare citita de la tastatura - comision. iar din suma finala ROn se va scadea comisionul 