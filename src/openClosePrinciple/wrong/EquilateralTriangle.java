package openClosePrinciple.wrong;

import javax.swing.plaf.SliderUI;

public class EquilateralTriangle{
	
	private double sides;
	private double sideLength;
	
	public EquilateralTriangle (double sideLenth) {
		this.sideLength = sideLenth;
		this.sides = 3;
	}

	public double getSides() {
		return sides;
	}


	public double getSideLength() {
		return sideLength;
	}

	public void setSideLength(double sideLength) {
		this.sideLength = sideLength;
	}
	
}
