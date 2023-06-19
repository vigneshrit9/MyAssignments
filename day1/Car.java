package week1.day1;

public class Car {

	public void driveCar() {
		System.out.println("Drive a car");

	}

	void applyBrake() {
		System.out.println("Apply the brake");

	}

	private void soundHorn() {

		System.out.println("Apply sound horn");

	}

	public void isPuncture() {
		System.out.println("The car is puncture");

	}


	public static void main(String[] args) {

		Car c = new Car();
		c.driveCar();
		c.applyBrake();
		c.soundHorn();
		c.isPuncture();






	}

}
