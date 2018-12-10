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

public class Rectangle implements Shape {

	int length;
	int width;

	public Rectangle(int lngth, int wdth) {
		this.length = lngth;
		this.width = wdth;
	}

	@Override
	public double getArea() {
		return this.length * this.width;
	}

	@Override
	public double getPerimeter() {
		return this.length * 2 + this.width * 2;
	}

}
