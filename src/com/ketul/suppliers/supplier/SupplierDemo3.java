package com.ketul.suppliers.supplier;

import java.util.function.Supplier;

public class SupplierDemo3 {
    public static void main(String[] args) {
        Supplier<String> randomName = () -> {
                String[] name = {"Ketul", "Sunny", "Pinny", "Binny", "Chinny"};
                return name[(int)(Math.random() * 5)];
        };

        System.out.println("Your Name is " + randomName.get());
    }
}
