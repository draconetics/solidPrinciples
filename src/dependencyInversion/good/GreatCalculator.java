package dependencyInversion.good;

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


	public void calculate(List <IGeometricShape> shapes) {
		
		
		AreaOperations areaOperations = new AreaOperations();
		PerimeterOperations perimeterOperations = new PerimeterOperations();
		
		totalAreas = areaOperations.Sum(shapes);
		totalPerimeters = perimeterOperations.perimeter(shapes);
	}
}
