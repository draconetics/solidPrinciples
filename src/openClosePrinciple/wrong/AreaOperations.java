package openClosePrinciple.wrong;

import java.util.List;

import javax.sql.rowset.spi.TransactionalWriter;

public class AreaOperations {
	
	public double sumAreas(List<Object> list) {
		double area = 0;
		for (Object shape : list) {
			if(shape instanceof Rectangle){
				Rectangle rectangle = (Rectangle) shape;
				area += (rectangle.getHeight() * rectangle.getWidth());
			}
			
			if(shape instanceof EquilateralTriangle){
				EquilateralTriangle triangle = (EquilateralTriangle) shape;
				area += ( (Math.sqrt(3)/4) * Math.pow(triangle.getSideLength(), 2) );
			}
			
		}
		return area;
	}
}
