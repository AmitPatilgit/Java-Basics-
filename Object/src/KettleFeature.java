
public class KettleFeature {

	public static void main(String[] args) 
	{
	Kettle c1= new Kettle();	
	System.out.println("--->Before initializing<---");
	System.out.println("Modelnumber = " + c1.modelnumber + " ,Capacity in liters = " + c1.capacity + " ,Colour = " + c1.colour);
	c1.modelnumber=502623631;
	c1.capacity=1.5;
	c1.colour="Grey";
	System.out.println("--->After Initialization<---");
	System.out.println("Modelnumber = " + c1.modelnumber + " ,Capacity in liters = " + c1.capacity + " ,Colour = " + c1.colour);
	System.out.println("-->Behaveiour<--");
	c1.heat();
	c1.cool();

	}

}
