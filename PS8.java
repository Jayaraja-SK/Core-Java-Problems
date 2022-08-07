import java.util.*;
import java.io.*;


class Vehicle {

}


class Bike extends Vehicle {

}


class Car extends Vehicle {

}


class SUV extends Car {

}



public class PS8 {

	public static void addCarLowerBound(List<? super Car> cars) { // ACCEPTS TYPES OF SUPERCLASS

	}


	public static void addCarUpperBound(List<? extends Car> cars) { // ACCEPTS TYPES OF SUBCLASS

	}


	public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);

		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		List<Car> cars = new ArrayList<Car>();
		List<Bike> bikes = new ArrayList<Bike>();
		List<SUV> suv_cars = new ArrayList<SUV>();

		addCarLowerBound(cars);
		addCarLowerBound(vehicles);
		//addCarLowerBound(suv_cars);

		addCarUpperBound(cars);
		addCarUpperBound(suv_cars);
		//addCarUpperBound(vehicles);
	}	
}