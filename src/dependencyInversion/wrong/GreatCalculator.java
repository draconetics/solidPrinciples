package dependencyInversion.wrong;

import java.util.ArrayList;
import java.util.List;


public class GreatCalculator {
	
	private double totalAreas;
	private double totalPerimeters;
	
	public double getTotalAreas() {
		return totalAreas;
	}


	public double getTotalPerimeters() {
		return totalPerimeters;
	}


	public void calculate() {
		
		List <IGeometricShape> shapes = new ArrayList<IGeometricShape>();
		//Rectangle rect = new Rectangle(10, 10);
		shapes.add(new Rectangle(10, 20));
		shapes.add(new Rectangle(10, 20));
		shapes.add(new Rectangle(10, 20));
		shapes.add(new Square(20));
		shapes.add(new EquilateralTriangle(20));
		
		AreaOperations areaOperations = new AreaOperations();
		PerimeterOperations perimeterOperations = new PerimeterOperations();
		
		totalAreas = areaOperations.Sum(shapes);
		totalPerimeters = perimeterOperations.perimeter(shapes);
	}
}
