package cst8284.generics;

public class Rectangle extends GeometricShape {

	private double length;

	public Rectangle(){
		this(1.0, 1.0);
	}   // default constructor
	public Rectangle(double width, double length) {
		setWidth(width);
		setLength(length);

	}   // base constructor
	public Rectangle(Rectangle rectangle){ 
		rectangle.getWidth();
		rectangle.getLength();

	}   // copy constructor


	public double getLength() {

		return length ;
	}

	public void setLength(double length) {

		this.length = length;

	}


	@Override
	public double getArea() {
		// TODO Auto-generated method stub

		return getLength()*getWidth();
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*getLength() + 2*getWidth();
	}

	@Override
	public String toString(){return ("Rectangelar Overrides " + super.toString());}

	//	 @Override
	//	   public boolean equals(Object obj){
	//		   return ((obj instanceof Rectangle) && ((Rectangle)obj).getWidth() == this.getWidth()) && ((Rectangle)obj).getLength() == this.getLength();
	//
	//	   }

	@Override
	public boolean equals(Object o){
		return (this.getArea() ==
				((GeometricShape) o).getArea());
	}


}
