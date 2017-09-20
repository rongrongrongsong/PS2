package pkgShape;

public class Rectangle {
	private int Width;
	private int Length;
	public Rectangle(int width, int length) {
		super();
		Width = width;
		Length = length;
	}
	public int getWidth() {
		return Width;
	}
	public void setWidth(int width) {
		Width = width;
	}
	public int getLength() {
		return Length;
	}
	public void setLength(int length) {
		Length = length;
	}
	public double area()
	{
		return getLength()*getWidth();
				
	}
	public double perimeter()
	{
		return 2*(getLength()+getWidth());
	}
}
