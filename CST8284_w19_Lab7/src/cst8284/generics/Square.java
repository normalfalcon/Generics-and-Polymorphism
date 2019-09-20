package cst8284.generics;

public class Square extends GeometricShape {

	public Square(){this(1.0);
	}   // default constructor
	public Square(double width){
		setWidth(width);
	}   // base constructor
	public Square(Square square){
		square.getWidth();
	}  //copy constructor

	@Override
	public String toString(){return ("Square Overrides " + super.toString());}

	//	   @Override
	//	   public boolean equals(Object obj){
	//		   return ((obj instanceof Square) && ((Square)obj).getWidth() == this.getWidth());
	//	   }

	@Override
	public boolean equals(Object o){
		return (this.getArea() ==
				((GeometricShape) o).getArea());
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return getWidth()*getWidth(); 
	}
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 4*getWidth();
	}


	//Perimeter of a square is 4*width
	//Area of a square width*width
}
