package com.ketul.suppliers.primitiveSuppliers;

import java.util.function.DoubleSupplier;

public class DoubleSupplierDemo1 {
    public static void main(String[] args) {
        DoubleSupplier pi = () -> 3.14;

        System.out.println("Your PI value is : ---> " + pi.getAsDouble());
    }
}
