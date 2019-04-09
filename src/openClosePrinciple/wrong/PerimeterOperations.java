package openClosePrinciple.wrong;

import java.util.List;

public class PerimeterOperations {
	
	public double sumPerimeters(List<Rectangle> listRectangles) {
		double area = 0;
		for (Rectangle rectangle : listRectangles) {
			area += (rectangle.getHeight() * 2) + (rectangle.getWidth() * 2);
		}
		return area;
	}

}
