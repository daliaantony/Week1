package week1.day1;

public class Car {

	public void driveCar() {
		System.out.println("printing driveCar method");
	}
	public void applyBrake() {
		System.out.println("printing applyBrake method");
	}
	public void soundHorn() {
		System.out.println("printing soundHorn method");
	}
	public void isPuncture() {
		System.out.println("printing isPuncture method");
	}
	public static void main(String[] args) {
		Car c=new Car();
		c.driveCar();
		c.applyBrake();
		c.soundHorn();
		c.isPuncture();
		
	}
	
}


