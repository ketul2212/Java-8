package com.ketul.suppliers.primitiveSuppliers;

import java.util.function.IntSupplier;

public class IntSupplierDemo1 {
    public static void main(String[] args) {
        IntSupplier generateNumber = () -> (int)(Math.random() * 10);

        String otp = "";
        for(int i = 0; i < 6; i++)
            otp += generateNumber.getAsInt();

        System.out.println("Your OTP is : ---> " + otp);
    }
}
