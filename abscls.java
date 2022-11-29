import java.util.StringTokenizer;

abstract class Shape {
	abstract void numberOfSides();
}

class Triangle extends Shape {
	void numberOfSides() {
		System.out.println("No of sides of Triangle: 3");
	}
}

class Rectangle extends Shape {
	void numberOfSides() {
		System.out.println("No of sides of Rectangle: 4");
	}
}

class Hexagon extends Shape {
	void numberOfSides() {
		System.out.println("No of sides of Hexagon: 6");
	}
}


public class abscls {
	public static void main(String []args) {
		Triangle t = new Triangle();
		Rectangle r = new Rectangle();
		Hexagon h = new Hexagon();
		
		t.numberOfSides();
		r.numberOfSides();
		h.numberOfSides();
	}
}
