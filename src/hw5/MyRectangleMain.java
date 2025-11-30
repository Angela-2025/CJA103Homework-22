package hw5;

public class MyRectangleMain {

	public static void main(String[] args) {
		MyRectangle rt = new MyRectangle();
		rt.setWidth(10);
		rt.setDepth(20);
		System.out.println(rt.getArea());
		
		MyRectangle rt2 = new MyRectangle(10,20);
		System.out.println(rt2.getArea());
		
	}
}
