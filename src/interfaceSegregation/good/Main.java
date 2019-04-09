package interfaceSegregation.good;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		Square square = new Square();
		square.setSideLength(10);
		
		List<IHasArea> list = new ArrayList<IHasArea>();
		list.add(new Rectangle( 10, 20));
		list.add(new Rectangle( 10, 20));
		list.add(square);
		
		AreaOperations areaOperations = new AreaOperations();
		
		//10*20 + 10*20 + 10*10 = 500
		System.out.println(areaOperations.Sum(list));
	}
}
