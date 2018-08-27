class Demo
{
	static
	{
		System.out.println("Static block called");
	}
}

class Q4
{
	public static void main(String[] x)
	{
		System.out.println("main funtion called");
		Demo obj = new Demo();
	}
}