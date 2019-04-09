package dependencyInversion.wrong;

import java.util.List;

public class PerimeterOperations {
	
	public double perimeter(List<IGeometricShape> shapes) {
		double area = 0;
		for (IHasPerimeter shape : shapes) {
			area += shape.perimeter();
		}
		
		return area;
	}
}

