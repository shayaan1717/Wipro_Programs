package com.wipro.day_four;



abstract class Vehicle_drive {
	 abstract void speed();
	 abstract void brand();
}

	class Car extends Vehicle_drive{
		void speed() {
			System.out.println("speed of the car : 4km/hr");	
		}
		void brand() {
			System.out.println("brand is: audi");
		}
		
	}
	class Bike extends Vehicle_drive{
		void speed() {
			System.out.println("speed of the bike : 4km/hr");
		}
		void brand() {
			System.out.println("brand is: yamaha");
		}
	}

public class Vehicle_main {
	public static void main(String[] args) {
		Vehicle_drive vd = new Car();
		 vd.speed();
		 vd.brand();
		Vehicle_drive vd1 = new Bike();
		 vd1.brand();
		 vd1.speed();
	}

}

