package com.uday.ecommerce;

import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static List<Product> cart = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("*****************************************");
        System.out.println("        Welcome to Uday.Com Shopping       ");
        System.out.println("*****************************************");

        while (true) {
            System.out.println("\nMain Categories:");
            int i = 1;
            for (String category : Store.subCategories.keySet()) {
                System.out.println(i++ + ". " + category);
            }
            System.out.print("Choose a category (1-4): ");
            int catChoice = sc.nextInt();
            sc.nextLine();
            String selectedCategory = (String) Store.subCategories.keySet().toArray()[catChoice - 1];

            String[] subCats = Store.subCategories.get(selectedCategory);
            System.out.println("\nSubcategories in " + selectedCategory + ":");
            for (int j = 0; j < subCats.length; j++) {
                System.out.println((j + 1) + ". " + subCats[j]);
            }
            System.out.print("Choose a subcategory (1-3): ");
            int subChoice = sc.nextInt();
            sc.nextLine();
            String selectedSubCategory = subCats[subChoice - 1];

            List<Product> productList = Store.products.getOrDefault(selectedSubCategory, new ArrayList<>());
            if (productList.isEmpty()) {
                System.out.println("No products available.");
                continue;
            }

            System.out.println("\nProducts in " + selectedSubCategory + ":");
            for (int k = 0; k < productList.size(); k++) {
                System.out.println((k + 1) + ". " + productList.get(k));
            }

            System.out.print("Select product to add to cart (1-5): ");
            int productChoice = sc.nextInt();
            sc.nextLine();
            Product chosenProduct = productList.get(productChoice - 1);
            cart.add(chosenProduct);
            System.out.println(chosenProduct.getName() + " added to cart!");

            System.out.print("\n1. Continue Shopping\n2. Checkout\nChoose option: ");
            int next = sc.nextInt();
            sc.nextLine();
            if (next == 2) {
                checkout();
                break;
            }
        }
    }

    public static void checkout() {
        System.out.println("\n********** BILL **********");
        double total = 0;
        for (Product p : cart) {
            System.out.println(p);
            total += p.getPrice();
            System.out.println("----------------------------");
        }
        System.out.printf("Total Amount: ₹%.2f\n", total);
        System.out.println("***************************");
        System.out.println("Thank you for shopping!");
    }
}
