abstract class Vehicle
{
	abstract void calculateSpeed();
	
	
}

class Car extends Vehicle
{
	void calculateSpeed()
	{
		System.out.println("100 km/hour");
	}
}

class Bus extends Vehicle
{
	void calculateSpeed()
	{
		System.out.println("80 km/hour");
	}
}

public class AbstractClassExample {

	public static void main(String[] args) {
		Vehicle v=new Car();
		
		v.calculateSpeed();
		v=new Bus();
		v.calculateSpeed();

	}

}
