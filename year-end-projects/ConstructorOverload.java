public class ConstructorOverload
{
	int length, breadth;

	public ConstructorOverload(int side)
	{
		length = side;
		breadth = side;
	}

	public ConstructorOverload(int l, int b)
	{
		length = l;
		breadth = b;
	}

	public int getConstructorOverload()
	{
		return length * breadth;
	}

	public static void main(String args[])
	{
		// for square
		ConstructorOverload obj1 = new ConstructorOverload(3);
		System.out.println("Creating square object...");
		System.out.println("ConstructorOverload of square:" + obj1.getConstructorOverload());
		// for rectangle
		ConstructorOverload obj2 = new ConstructorOverload(4, 6);
		System.out.println("Creating rectangle object...");
		System.out.println("ConstructorOverload of recangle:" + obj2.getConstructorOverload());
	}
}
