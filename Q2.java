class Complex
{
	private double real, imag;
	
	public void setValue(double r, double i)
	{
		real = r;
		imag = i;
	}
	
	public void display()
	{
		System.out.println("The complex number : " + real + " + i" + imag);
	}
}

class Q2
{
	public static void main(String x[])
	{
		Complex obj = new Complex();
		obj.setValue(5.0,2.9);
		obj.display();
	}
}