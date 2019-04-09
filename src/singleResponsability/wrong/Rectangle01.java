package singleResponsability.wrong;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Rectangle
 * 
 * @author draconetics
 *
 */

public class Rectangle01 {

	private double side;
	private double height;
	private double width;
	
	
	public Rectangle01(double side, double height, double width) {
		super();
		this.side = side;
		this.height = height;
		this.width = width;
	}



	public double getSide() {
		return side;
	}



	public void setSide(double side) {
		this.side = side;
	}



	public double getHeight() {
		return height;
	}



	public void setHeight(double height) {
		this.height = height;
	}



	public double getWidth() {
		return width;
	}

	
	public void setWidth(double width) {
		this.width = width;
	}

	public static double sumAreas(List<Rectangle01> listRectangles) {
		double area = 0;
		for (Rectangle01 rectangle : listRectangles) {
			area += (rectangle.getHeight() * rectangle.getWidth());
		}
		
		return area;
	}
	
	public static double sumPerimeters(List<Rectangle01> listRectangles) {
		double area = 0;
		for (Rectangle01 rectangle : listRectangles) {
			area += (rectangle.getHeight()*2) + (rectangle.getWidth()*2);
		}
		return area;
	}

	public static void main(String[] args) {
		List<Rectangle01> listRectangles = new ArrayList<Rectangle01>();
		listRectangles.add(new Rectangle01(0, 10, 20));
		listRectangles.add(new Rectangle01(0, 10, 20));
		listRectangles.add(new Rectangle01(0, 20, 30));
		
		//10*20 + 10*20 + 20*30 = 1000
		System.out.println(Rectangle01.sumAreas(listRectangles));
	}
}
