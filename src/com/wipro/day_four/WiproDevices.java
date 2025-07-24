package com.wipro.day_four;

interface WiproSystems{
	void deviceType();
	void compilespeed();
}
class Desktop implements WiproSystems{
	public void deviceType() {
		System.out.println("Wipro provides device: DESKTOP\n");
	}
	public void compilespeed() {
		System.out.println("Code is compiled faster in Desktop\n");
}
}
class Laptop implements WiproSystems{
	public void deviceType() {
		System.out.println("Wipro provides device: LAPTOP \n");
	}
	public void compilespeed() {
		System.out.println("Code is compiled slower in Laptop\n");
}
	
	}
public class WiproDevices {
	public static void main(String[] args) {
		WiproSystems laptop=new Laptop();
		laptop.deviceType();
		laptop.compilespeed();
		
		WiproSystems desktop=new Desktop();
		desktop.deviceType();
		desktop.compilespeed();
	}
}

