package Teme2;

import java.util.Scanner;

//1. Sa se implementeze o metoda care verifica daca un numar primit ca parametru este par.

public class ParSauImpar {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Numar: ");
		int nr = in.nextInt();

		if (nr % 2 == 0) {
			System.out.println("Par");
		} else {
			System.out.println("Impar");
		}
		// private static boolean isOdd (int nr){
		// return nr % 2 == 1;}
	}
}
