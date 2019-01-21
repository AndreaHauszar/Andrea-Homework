package project.core.keyboard;

import java.util.Scanner;

public class Keyboard {
	private Scanner kb = new Scanner(System.in);

	private static Keyboard instance = new Keyboard();

	public static Keyboard getInstance() {
		return instance;
	}

	public String getText() {
		return kb.nextLine();
	}

	public String getString(String message) {
		System.out.print(message);
		String value = kb.toString();
		kb.nextLine();
		return value;
	}

	public int getInt(String message) {
		System.out.print(message);
		int value = kb.nextInt();
		kb.nextLine();
		return value;
	}

}
