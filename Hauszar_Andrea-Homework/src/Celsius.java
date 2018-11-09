import java.util.Scanner;

public class Celsius {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Temperatura In Fahrenheit:");
		int a = scanner.nextInt();

		System.out.print("Temperatura In Celsius:");
		System.out.print((a - 32) * 5 / 9);
		scanner.close();
	}
}
