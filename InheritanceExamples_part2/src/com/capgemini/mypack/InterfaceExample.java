package com.capgemini.mypack;

interface Vehicle
{
	 void calculateSpeed();
	
}

class Car implements Vehicle
{
	public void calculateSpeed()
	{
		System.out.println("100 km/hour");
	}
}

class Bus implements Vehicle
{
	public void calculateSpeed()
	{
		System.out.println("80 km/hour");
	}
}

public class InterfaceExample {

	public static void main(String[] args) {
		Vehicle v=new Car();
		
		v.calculateSpeed();
		v=new Bus();
		v.calculateSpeed();
		
		//v.show();
		
		//Vehicle.show();
		//v.show();

	}

}
