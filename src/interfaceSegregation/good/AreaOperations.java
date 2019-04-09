package interfaceSegregation.good;

import java.util.List;

public class AreaOperations {

	public double Sum(List<IHasArea> shapes) {
		double area = 0;
		for (IHasArea shape : shapes) {
			area += shape.area();
		}
		
		return area;
	}
	
}
