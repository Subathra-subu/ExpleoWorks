package abstraction;

import java.util.Scanner;



abstract class Shape{
	
	void draw() {
		System.out.println("Drawing..");
	}
	
	public abstract void area();
	
	public abstract void perimeter();
	
}

class Rectangle extends Shape{
	
	private int length;
	private int breadth;
	
	public Rectangle(int length,int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public void area() {
		System.out.println("Area of Rectangle:"+(length*breadth));
	}
	
	public void perimeter() {
		System.out.println("Perimeter of Rectangle:"+2*(length+breadth));
	}
}

class Circle extends Shape{
	
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public void area() {
		System.out.println("Area of Circle:"+(3.14*radius*radius));
	}
	
	public void perimeter() {
		System.out.println("Perimeter of Circle:"+(2*3.14*radius));
	}
}

class Square extends Shape{
	
	private int size;
	
	public Square(int size) {
		this.size = size;
	}
	
	public void area() {
		System.out.println("Area of Square:"+(size*size));
	}
	
	public void perimeter() {
		System.out.println("Perimeter of Square:"+(4*size));
	}
}

public class ShapeDemo {
	
	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the length of rectangle:");
		int length = scanner.nextInt();
		
		System.out.println("Enter the breadth of rectangle:");
		int breadth = scanner.nextInt();
		
		System.out.println("Enter the radius of circle:");
		int radius = scanner.nextInt();
		
		System.out.println("Enter the size of square:");
		int size = scanner.nextInt();
		
		Rectangle rectangle = new Rectangle(length, breadth);
		
		Circle circle = new Circle(radius);
		
		Square square = new Square(size);
		
		rectangle.area();
		rectangle.perimeter();
		
		circle.area();
		circle.perimeter();
		
		square.area();
		square.perimeter();
		
		scanner.close();
		
		
	}

}
