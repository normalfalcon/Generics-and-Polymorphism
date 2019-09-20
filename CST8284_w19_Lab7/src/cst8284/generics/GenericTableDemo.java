package cst8284.generics;
import java.util.ArrayList;
import java.util.Arrays;


public class GenericTableDemo {

	public static void main(String [] arg) {

		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,2,1));
		ArrayList<String> strings = new ArrayList<>(Arrays.asList("myString", new String ("myString"), "myString"));
		ArrayList<GeometricShape> geometricObjects=new ArrayList<GeometricShape>();

		Circle cylinder=new Circle(3.0);
		Square cube=new Square(2);
		Rectangle block=new Rectangle(3,2);
		Rectangle block2=new Rectangle(1,2);

		geometricObjects.add(cylinder);
		geometricObjects.add(cube);
		geometricObjects.add(block);
		geometricObjects.add(block2); 

		ArrayList<SolidObject<GeometricShape>> solidObjects = new ArrayList<>();

		SolidObject<GeometricShape> cil = new SolidObject<>(new Circle(3.0), 5.0);
		SolidObject<GeometricShape> blk = new SolidObject<>(new Rectangle(10.0, 9.0), 2.0);
		SolidObject<GeometricShape> blk2 = new SolidObject<>(new Rectangle(3.0, 6.0), 10.0);
		SolidObject<GeometricShape> cub = new SolidObject<>(new Square(6.0));

		solidObjects.add(cil);
		solidObjects.add(blk);
		solidObjects.add(blk2);
		solidObjects.add(cub);

		Table.displayEqualityTable(numbers);
		Table.displayEqualityTable(strings);
		Table.displayEqualityTable(geometricObjects);
		Table.displayEqualityTable(solidObjects);

	}
}

