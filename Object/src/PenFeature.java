
public class PenFeature {

	public static void main(String[] args) 
	{
	Pen p1=new Pen();
	System.out.println("--->Before Initialzing<---");
	System.out.println("Cap = " + p1.cap + " ,Price = " + p1.price + " ,Brand = " + p1.brand);
	p1.cap="pen is Capped";
	p1.price=5;
	p1.brand="Reynolds";
	System.out.println("--->After Initialzing<---");
	System.out.println("Cap = " + p1.cap + " ,Price = " + p1.price + " ,Brand = " + p1.brand);
	//Behaviour
	Pen.write();
	Pen.stop();
	Pen.leakage();
			

	}

}
