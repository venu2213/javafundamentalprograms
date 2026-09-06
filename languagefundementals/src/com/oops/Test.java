package com.oops;

class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    Dog(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println(name + " says: Woof!");
    }
}

public class Test {

	public static void main(String[] args) {
		Animal a = new Dog("Buddy");

        System.out.println("Animal Name: " + a.name);
        a.sound();

	}

}
