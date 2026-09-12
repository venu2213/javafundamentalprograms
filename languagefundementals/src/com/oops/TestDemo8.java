package com.oops;

class ElectricCar {
    String brand;
    int battery;

    ElectricCar(String brand, int battery) {
        this.brand = brand;
        this.battery = battery;
    }

    void charge() {
        System.out.println(brand + " is charging...");
    }

    void drive() {
        System.out.println(brand + " is driving with " + battery + "% battery.");
    }
}


public class TestDemo8 {

	public static void main(String[] args) {
		ElectricCar car = new ElectricCar("Tesla", 80);

        car.charge();
        car.drive();

	}

}
