//3. Sa se implementeze o metoda care primeste ca parametru un sir de numere si returneaza cate perechi de numere din sir

//au suma egala cu 10
//Ex: {1,3,5,6,7,8,9} => 2

package Teme5;

public class PerechiNumere {
	public static void main(String[] args) {
		int numbers[] = { 2, 5, 7, 8, 3, 9 };
		int sum = 10;
		System.out.println(getEqualSumPairs(numbers, sum));

	}

	private static int getEqualSumPairs(int[] numbers, int sum) {
		int count = 0;
		for (int x = 0; x < numbers.length; x++)

			for (int y = x + 1; y < numbers.length; y++)
				if ((numbers[x] + numbers[y]) == sum)
					count++;
		return count;

	}
}
