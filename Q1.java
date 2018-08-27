class Rectangle
{
	private double length, breadth, area;
	
	public void setVal(double x, double y)
	{
		length = x;
		breadth = y;
	}
	
	public void CalculateArea()
	{
		area = length * breadth;
	}
	
	public void getArea()
	{
		System.out.println("Area is : " + area);
	}
}

class Q1
{
	public static void main(String x[])
	{
		Rectangle obj = new Rectangle();
		obj.setVal(5.0,2.9);
		obj.CalculateArea();
		obj.getArea();
	}
}