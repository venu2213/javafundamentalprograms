package com.oops;

class Product {
    int productId;
    String productName;
    double price;

    Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    void displayProductDetails() {
        System.out.println("Product ID   : " + productId);
        System.out.println("Product Name : " + productName);
        System.out.println("Price        : " + price);
    }

    double calculateDiscount() {
        return 0;
    }
}

class Electronics extends Product {
    String brand;

    Electronics(int productId, String productName, double price, String brand) {
        super(productId, productName, price);
        this.brand = brand;
    }

    @Override
    double calculateDiscount() {
        return price * 0.10; // 10% discount
    }

    @Override
    void displayProductDetails() {
        super.displayProductDetails();
        System.out.println("Brand        : " + brand);
        System.out.println("Discount     : " + calculateDiscount());
        System.out.println("Final Price  : " + (price - calculateDiscount()));
    }
}

class Clothing extends Product {
    String size;

    Clothing(int productId, String productName, double price, String size) {
        super(productId, productName, price);
        this.size = size;
    }

    @Override
    double calculateDiscount() {
        return price * 0.20; // 20% discount
    }

    @Override
    void displayProductDetails() {
        super.displayProductDetails();
        System.out.println("Size         : " + size);
        System.out.println("Discount     : " + calculateDiscount());
        System.out.println("Final Price  : " + (price - calculateDiscount()));
    }
}

class Furniture extends Product {
    String material;

    Furniture(int productId, String productName, double price, String material) {
        super(productId, productName, price);
        this.material = material;
    }

    @Override
    double calculateDiscount() {
        return price * 0.15; // 15% discount
    }

    @Override
    void displayProductDetails() {
        super.displayProductDetails();
        System.out.println("Material     : " + material);
        System.out.println("Discount     : " + calculateDiscount());
        System.out.println("Final Price  : " + (price - calculateDiscount()));
    }
}

public class TestDemo6 {

	public static void main(String[] args) {
		Electronics e = new Electronics(
                101, "Laptop", 60000, "Dell");

        Clothing c = new Clothing(
                102, "T-Shirt", 2000, "L");

        Furniture f = new Furniture(
                103, "Dining Table", 30000, "Wood");

        System.out.println("----- ELECTRONICS -----");
        e.displayProductDetails();

        System.out.println("\n----- CLOTHING -----");
        c.displayProductDetails();

        System.out.println("\n----- FURNITURE -----");
        f.displayProductDetails();

	}

}
