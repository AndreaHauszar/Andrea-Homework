import java.util.Scanner;

public class Comision {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduceti Cursul Valutar Euro:");
		float CursValutar = scanner.nextFloat();
		System.out.print("Introduceti Comisionul:");
		float Comision = scanner.nextFloat();
		System.out.print("Introduceti O Suma In Euro:");
		int SumaEuro = scanner.nextInt();

		float TotalCuComision = ((SumaEuro * CursValutar) - ((SumaEuro * CursValutar) * Comision / 100));
		float TotalFaraComision = (SumaEuro * CursValutar);

		System.out.println(+SumaEuro + " Euro * " + CursValutar + " RON/Euro = " + TotalFaraComision + " RON - "
				+ Comision + " % = " + TotalCuComision + " RON");

		System.out.print("Valoare In Ron:");
		System.out.print((SumaEuro * CursValutar) - ((SumaEuro * CursValutar) * Comision / 100));
		System.out.println(" RON");
	}
}

//se adauga inca o valoare citita de la tastatura - comision. iar din suma finala ROn se va scadea comisionul 