package singleResponsability.good;

import java.util.List;

public class AreaOperations {
	
	public double sumAreas(List<Rectangle02> listRectangles) {
		double area = 0;
		for (Rectangle02 rectangle : listRectangles) {
			area += (rectangle.getHeight() * rectangle.getWidth());
		}
		
		return area;
	}
}
