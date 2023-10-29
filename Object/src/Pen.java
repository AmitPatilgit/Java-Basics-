
public class Pen 
{
//State
	String cap;
	int price;
	String brand;
//Behaviour
	static void write()
	{
		System.out.println("The pen is working ");
	}
	static void stop()
	{
		System.out.println("The pen is not working");
	}
	static void leakage()
	{
		System.out.println("The pen is leaking ");
	}
}
