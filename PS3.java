import java.util.*;

class Shape {
	void draw() {
		System.out.println("");
	}

	void erase() {
		System.out.println("");
	}
}

class Circle extends Shape {
	void draw() {
		System.out.println("CIRCLE - DRAW");
	}

	void erase() {
		System.out.println("CIRCLE - ERASE");
	}
}

class Rectangle extends Shape {
	void draw() {
		System.out.println("RECTANGLE - DRAW");
	}

	void erase() {
		System.out.println("RECTANGLE - ERASE");
	}
}

class Triangle extends Shape {
	void draw() {
		System.out.println("TRIANGLE - DRAW");
	}

	void erase() {
		System.out.println("TRIANGLE - ERASE");
	}
}

public class PS3 {
	public static void main(String args[]) {
		Shape c = new Circle();
		Shape r = new Rectangle();
		Shape t = new Triangle();

		c.draw();
		c.erase();

		r.draw();
		r.erase();

		t.draw();
		t.erase();
	}	
}