package singleResponsability.good;

import java.util.List;

public class PerimeterOperations {
	
	public double sumPerimeters(List<Rectangle02> listRectangles) {
		double area = 0;
		for (Rectangle02 rectangle : listRectangles) {
			area += (rectangle.getHeight() * 2) + (rectangle.getWidth() * 2);
		}
		return area;
	}

}
