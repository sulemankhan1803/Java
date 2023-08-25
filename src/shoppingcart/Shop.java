package shoppingcart;

import java.util.ArrayList;
import java.util.Scanner;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

public class Shop {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Maggi", 12));
        products.add(new Product("Soap", 80));
        products.add(new Product("Shampoo", 500));
        products.add(new Product("Milk", 40));
        products.add(new Product("Curd", 40));
        products.add(new Product("Cheese", 250));
        products.add(new Product("Bread", 40));
        products.add(new Product("Egg", 5));
        products.add(new Product("Toothpaste", 75));
        products.add(new Product("Juice", 1.2));

        ArrayList<Product> cart = new ArrayList<>();
        ArrayList<Integer> cartQuantities = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Available Products:");
            for (int i = 0; i < products.size(); i++) {
                Product item = products.get(i);
                System.out.println((i + 1) + ". " + item.getName() + " - Rs." + item.getPrice());
            }

            System.out.print("\nEnter the product number to add to your cart (or 0 to get the bill, -1 to exit): ");
            int productChoice = scanner.nextInt();

            if (productChoice > 0 && productChoice <= products.size()) {
                Product selectedProduct = products.get(productChoice - 1);
                System.out.print("Enter quantity to add to cart: ");
                int quantity = scanner.nextInt();
                cart.add(selectedProduct);
                cartQuantities.add(quantity);
                System.out.println("Added " + selectedProduct.getName() + " x " + quantity + " to your cart.\n");
            } else if (productChoice == 0) {
                System.out.println("\nCart Contents:");
                System.out.println("------------------------------------------------------------");
                System.out.printf("%-20s | %-10s | %-8s | %-10s%n", "Product", "Price", "Quantity", "Total Price");
                System.out.println("------------------------------------------------------------");
                for (int i = 0; i < cart.size(); i++) {
                    Product item = cart.get(i);
                    int quantity = cartQuantities.get(i);
                    double itemPrice = item.getPrice() * quantity;
                    System.out.printf("%-20s | %-10.2f | %-8d | %.2f%n", item.getName(), item.getPrice(), quantity, itemPrice);
                }
                System.out.println("------------------------------------------------------------");
                double totalCartPrice = 0.0;
                for (int i = 0; i < cart.size(); i++) {
                    int quantity = cartQuantities.get(i);
                    double itemPrice = cart.get(i).getPrice() * quantity;
                    totalCartPrice += itemPrice;
                }
                System.out.printf("%46s Rs.%.2f%n", "Total Cart Price:", totalCartPrice);
                System.out.printf("\n%40s","Thank you for shopping!");
                break;
            } else if (productChoice == -1) {
                System.out.println("Exiting the shopping session. Thank you!");
                break;
            } else {
                System.out.println("Invalid product number.");
            }
        }
        scanner.close();
    }
}
