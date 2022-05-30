package com.ketul.suppliers.primitiveSuppliers;

import java.time.LocalDate;
import java.util.function.LongSupplier;

public class LongSupplierDemo1 {
    public static void main(String[] args) {
        LongSupplier generateNumber = () -> (long)(Math.random() * 10);

        String otp = "";
        for(int i = 0; i < 6; i++)
            otp += generateNumber.getAsLong();

        System.out.println("Your OTP is : ---> " + otp);

        LongSupplier epochLs = () -> LocalDate.now().toEpochDay();
        System.out.println(epochLs.getAsLong());
    }
}
