package Curs9;

public class StringSpeedDemo {
	public static void main(String[] args) {

		stringDemo();
		stringBuilderDemo();

	}

	private static void stringBuilderDemo() {
		long startTime = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 80000; i++) {
			sb.append(i);
		}
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
	}

//creem un string din contatenarea cifrelor de la 1-1000000
	private static void stringDemo() {
		long startTime = System.currentTimeMillis();
		String s = "";
		for (int i = 0; i < 80000; i++) {
			s += i;
		}
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
	}
}
