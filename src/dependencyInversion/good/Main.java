package dependencyInversion.good;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {

		List <IGeometricShape> shapes = new ArrayList<IGeometricShape>();
		//Rectangle rect = new Rectangle(10, 10);
		shapes.add(new Rectangle(10, 20));
		shapes.add(new Rectangle(10, 20));
		shapes.add(new Rectangle(10, 20));
		shapes.add(new Square(20));
		shapes.add(new EquilateralTriangle(20));
		
		GreatCalculator calculator = new GreatCalculator();
		calculator.calculate(shapes);
		System.out.println("Total Area: " + calculator.getTotalAreas());
		System.out.println("Total Perimeter: " + calculator.getTotalPerimeters());
	}
}
