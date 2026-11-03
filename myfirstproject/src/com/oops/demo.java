package com.oops;

class Shape {
	void area() {
		System.out.println("Calculating area of shapes ");
	}
}

class Circle extends Shape {
	double radius = 10.0;

	@Override
	void area() {
		double areaofcircle = 3.11 * radius * radius;
		System.out.println("Area of circle is : " + areaofcircle);
	}
}

class Rectangle extends Shape {
	int length = 10;
	int breadth = 20;

	@Override
	void area() {
		int aofr = length * breadth;
		System.out.println("Area of Rectangel is" + aofr);
	}

}

class Triangle extends Shape {
	int breadth = 10;
	int height = 50;

	@Override
	void area() {
		double aoft = 0.5 * breadth * height;
		System.out.println("Area of Triangle is " + aoft);
	}
}

class Square extends Shape {
	int side = 40;

	void area() {
		int aofs = side * side;
		System.out.println("Area of Square is:" + aofs);
	}

}

public class demo {

	public static void main(String[] args) {

		Shape sh = new Circle();
		sh.area();

		Circle c = new Circle();
		c.area();
		Rectangle r = new Rectangle();
		r.area();
		Triangle t = new Triangle();
		t.area();
		Square s = new Square();
		s.area();

	}

}
