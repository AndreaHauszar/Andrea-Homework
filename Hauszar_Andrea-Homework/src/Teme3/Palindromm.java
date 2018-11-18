//2.	Sa se implementeze o metoda care verifica daca un numar primit ca si parametru este palindrom. 
//Un palindrom e un numar care citit din ambele parti e la fel (ex: 123321, 121, ...).

package Teme3;

public class Palindromm {
	public static void main(String[] args) {

		int pali = 17;
		palindrom(pali);

	}

	private static void palindrom(int pali) {
		int rest;
		int reversePali = 0;
		int originalPali;

		originalPali = pali;
		while (pali > 0) {
			rest = pali % 10;
			reversePali = (reversePali * 10) + rest;
			pali = pali / 10;

		}

		if (reversePali == originalPali) {
			System.out.println("Palindom");
		} else {
			System.out.println("Not Palindrom");
		}
	}
}

// pana nu am creat int originalPali, si am zis ca e egal cu pali - nu functiona formula -> nu inteleg de ce 