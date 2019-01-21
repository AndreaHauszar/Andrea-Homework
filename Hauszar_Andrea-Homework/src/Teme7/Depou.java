//In depou se pot introduce locomotive, vagoane de pasageri si vagoane de marfa.

package Teme7;

public class Depou {
	public static void main(String[] args) {

		VagonMarfa m1 = new VagonMarfa("1", 50);
		VagonMarfa m2 = new VagonMarfa("2", 60);

		VagonPasageri p1 = new VagonPasageri("11", 10, 50);
		VagonPasageri p2 = new VagonPasageri("22", 20, 100);
		VagonPasageri p3 = new VagonPasageri("33", 30, 150);
		VagonPasageri p4 = new VagonPasageri("44", 40, 200);
		VagonPasageri p5 = new VagonPasageri("55", 50, 250);

		Locomotiva l1 = new Locomotiva("111", 100);
		Locomotiva l2 = new Locomotiva("222", 200);

		System.out.println(m1);
	}
}