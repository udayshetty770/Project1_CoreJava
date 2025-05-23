package com.uday.ecommerce;

import java.util.*;

public class Store {
    public static Map<String, String[]> subCategories = new HashMap<>();
    public static Map<String, List<Product>> products = new HashMap<>();

    static {
        subCategories.put("Fashion", new String[]{"Men", "Women", "Children"});
        subCategories.put("Electronics", new String[]{"Mobile", "Laptop", "Earphones"});
        subCategories.put("Household", new String[]{"Kitchen", "Cleaning", "Decor"});
        subCategories.put("Furniture", new String[]{"Sofa", "Table", "Chair"});

      
        products.put("Men", Arrays.asList(
            new Product("Levi's T-Shirt", "Levi's", 999, "Cotton T-shirt, Size M"),
            new Product("Puma Shoes", "Puma", 2499, "Running shoes"),
            new Product("U.S. Polo Shirt", "U.S. Polo", 1099, "Collar shirt"),
            new Product("Lee Jeans", "Lee", 1999, "Slim fit denim"),
            new Product("Nike Shorts", "Nike", 799, "Dry-fit sports shorts"),
            new Product("Adidas Hoodie", "Adidas", 2199, "Black, Size L"),
            new Product("HRX Tracksuit", "HRX", 2899, "Grey tracksuit"),
            new Product("Roadster Jacket", "Roadster", 3199, "Brown leather jacket")
        ));

      
        products.put("Women", Arrays.asList(
            new Product("Zara Dress", "Zara", 2599, "Floral midi dress"),
            new Product("H&M Top", "H&M", 899, "Cotton white top"),
            new Product("Biba Kurti", "Biba", 1499, "Printed long kurti"),
            new Product("Forever 21 Jeans", "Forever 21", 1899, "High-waist skinny jeans"),
            new Product("Allen Solly Blazer", "Allen Solly", 3499, "Formal blazer")
        ));

        products.put("Children", Arrays.asList(
            new Product("Mothercare Romper", "Mothercare", 699, "Infant romper"),
            new Product("Gap Kids Jeans", "Gap", 999, "Boys denim jeans"),
            new Product("Barbie T-Shirt", "Mattel", 499, "Pink graphic tee"),
            new Product("Ben10 Backpack", "Cartoon Network", 799, "School bag"),
            new Product("Nike Kids Shoes", "Nike", 1999, "Running shoes")
        ));

   
        products.put("Mobile", Arrays.asList(
            new Product("iPhone 14", "Apple", 79999, "128 GB, Blue"),
            new Product("Galaxy S21", "Samsung", 69999, "128 GB, Phantom Gray"),
            new Product("Redmi Note 11", "Xiaomi", 15999, "64 GB, Black"),
            new Product("Realme Narzo", "Realme", 12999, "Blue, 6GB RAM"),
            new Product("Pixel 6a", "Google", 34999, "128 GB, Charcoal"),
            new Product("OnePlus Nord CE 3", "OnePlus", 24999, "8GB RAM, 128GB Storage"),
            new Product("Motorola G73", "Motorola", 16999, "256GB, Lucent White")
        ));

       
        products.put("Laptop", Arrays.asList(
            new Product("MacBook Air M2", "Apple", 104999, "8GB RAM, 256GB SSD"),
            new Product("Dell Inspiron 15", "Dell", 58999, "i5, 8GB RAM, 512GB SSD"),
            new Product("HP Pavilion x360", "HP", 64999, "i3, Touchscreen"),
            new Product("Asus ROG Strix", "Asus", 89999, "Gaming laptop, RTX 3050"),
            new Product("Lenovo Ideapad Slim 3", "Lenovo", 47999, "Ryzen 5, 16GB RAM")
        ));

      
        products.put("Earphones", Arrays.asList(
            new Product("AirPods Pro", "Apple", 24999, "Active noise cancellation"),
            new Product("Sony WF-1000XM4", "Sony", 19999, "Wireless earbuds"),
            new Product("Realme Buds Q2", "Realme", 2499, "Bluetooth earbuds"),
            new Product("boAt Airdopes 441", "boAt", 1499, "Touch controls"),
            new Product("JBL Tune 215BT", "JBL", 2199, "Neckband style")
        ));

       
        products.put("Kitchen", Arrays.asList(
            new Product("Prestige Pressure Cooker", "Prestige", 2199, "3L Stainless steel"),
            new Product("Butterfly Mixer Grinder", "Butterfly", 2999, "750W, 3 Jars"),
            new Product("Tupperware Container Set", "Tupperware", 899, "Set of 6"),
            new Product("Prestige Gas Stove", "Prestige", 3499, "2 Burner"),
            new Product("Philips Kettle", "Philips", 1599, "Electric kettle 1.5L")
        ));

        // Household > Cleaning
        products.put("Cleaning", Arrays.asList(
            new Product("Scotch-Brite Mop", "Scotch-Brite", 899, "Spin mop with bucket"),
            new Product("Dettol Surface Cleaner", "Dettol", 199, "1L disinfectant"),
            new Product("Vim Dishwash Gel", "Vim", 149, "750 ml"),
            new Product("3M Scrub Pad", "3M", 99, "Pack of 10"),
            new Product("Harpic Toilet Cleaner", "Harpic", 149, "500 ml")
        ));

       
        products.put("Decor", Arrays.asList(
            new Product("Wall Clock", "Ajanta", 699, "Classic round"),
            new Product("LED Strip Light", "Mivi", 1299, "5m RGB"),
            new Product("Table Lamp", "Philips", 999, "Touch dimmer"),
            new Product("Photo Frame Set", "Home Centre", 1199, "Set of 4"),
            new Product("Cushion Cover Set", "Spaces", 799, "Pack of 5")
        ));

       
        products.put("Sofa", Arrays.asList(
            new Product("3-Seater Sofa", "Urban Ladder", 24999, "Fabric, Grey"),
            new Product("Recliner Chair", "Godrej Interio", 21999, "Brown, Single Seater"),
            new Product("Sectional Sofa", "HomeTown", 32999, "L-shape, Blue"),
            new Product("Leatherette Sofa", "Pepperfry", 28999, "Black, 3-Seater"),
            new Product("Futon Sofa Bed", "Ikea", 19999, "Convertible")
        ));

        
        products.put("Table", Arrays.asList(
            new Product("Dining Table", "Nilkamal", 17999, "4-Seater, Wood finish"),
            new Product("Study Table", "Godrej", 7499, "With Drawer"),
            new Product("Coffee Table", "Urban Ladder", 3499, "Glass top"),
            new Product("Console Table", "Ikea", 5999, "Minimal design"),
            new Product("Foldable Table", "AmazonBasics", 2499, "Portable use")
        ));

        
        products.put("Chair", Arrays.asList(
            new Product("Office Chair", "Green Soul", 8999, "Ergonomic, High back"),
            new Product("Dining Chair", "Nilkamal", 1999, "Wooden"),
            new Product("Gaming Chair", "Savya Home", 12999, "Recliner, Red-Black"),
            new Product("Plastic Chair", "Cello", 799, "Set of 2"),
            new Product("Rocking Chair", "Durian", 7499, "Wooden, Brown")
        ));
    }
}
