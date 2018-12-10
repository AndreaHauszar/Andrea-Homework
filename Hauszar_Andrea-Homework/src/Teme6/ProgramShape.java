//2. Se da urmatoarea interfata:
//public interface Shape {
//  public double getArea();
//  public double getPerimeter();
//}
//
//Sa se implementeze 3 clase, Square, Rectangle, Circle care implementeaza aceasta interfata si sa se creeze un program in care se creaza un 
//array de Shape-uri care va contine cate o instanta din fiecare clasa creata iar fiecarei instante respective i se vor apela metodele getArea
//si getShape.

package Teme6;

public class ProgramShape {

	public static void main(String[] args) {

		Shape square = new Square(2);
		Shape rectangle = new Rectangle(3, 4);
		Shape circle = new Circle(5);

		Shape array[] = { square, rectangle, circle };

		for (int i = 0; i < array.length; i++) {
			System.out.println("Perimeter = " + array[i].getPerimeter() + "| Area = " + array[i].getArea());

		}

	}

}
