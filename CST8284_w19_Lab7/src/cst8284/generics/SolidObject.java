package cst8284.generics;

public class SolidObject <T extends GeometricShape> {
	
   // TODO: Use the UML diagram to create the members required

	private T shape;
	private double depth;
	
	protected SolidObject(T shape, double depth) {
		
		setDepth(depth);
		setGeometricShape(shape);
		
	}
	
	protected SolidObject(T shape) {
		this(shape, shape.getWidth());
		
		
	}
	
	public double getDepth() {
		
		return depth ;
	}
	
	public void setDepth(double depth) {
		
		this.depth = depth;
		
	}
	
	public T getGeometricShape() {
		
		return shape;
	}
	
	public void setGeometricShape(T shape) {
		
		this.shape = shape;
	}
	
	public String toString(){
		String solidTypeEquivalent = "unknown   ";
		String className = getGeometricShape().getClass().toString();
		className = className.substring(className.lastIndexOf('.')+1);
		
		switch (className) {
			case "Circle": 
				solidTypeEquivalent = "cylinder "; 
				break;
			case "Square":
				solidTypeEquivalent = "cube";
				break;
			case "Rectangle": 
				solidTypeEquivalent = "block"; 
				break;
			case "Triangle":
				solidTypeEquivalent = "prism";
				break;
		}	
		return solidTypeEquivalent;
	}
	
	public double getVolume() {
		
		return shape.getArea() * getDepth();     //VOLUME       
	}
	
	public double getSurfaceArea() { 
		
		return   shape.getPerimeter() * getDepth() + 2 * shape.getArea();    //AREA  
	}
	
	 @Override
	   public boolean equals(Object o){
	   return (getVolume() == (( SolidObject<GeometricShape>)o).getVolume());
	   }

}
