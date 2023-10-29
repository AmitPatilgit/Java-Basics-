
public class CarFeature {

	public static void main(String[] args)
	{
		// state
		Car c2 =new Car();
		System.out.println("--->Before Initialization<----");
		System.out.println("Price= " + c2.price + " , Chessisnumber = " + c2.chessisnumber + " , Colour = " + c2.color + " , Manufacturer = " + c2.manufacturer);
		c2.price=450000000;
		c2.chessisnumber="45ANJ58912";
		c2.color="Yellow";
		c2.manufacturer	="VOLSWAGEN";
		System.out.println("--->After Initialization<----");
		System.out.println("Price= " + c2.price + " , Chessisnumber = " + c2.chessisnumber + " , Colour = " + c2.color + " , Manufacturer = " + c2.manufacturer);
		Car.drive();
		Car.stop();
		Car.honk();
		
	}

}
