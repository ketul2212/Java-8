package com.ketul.suppliers.supplier;

import java.util.function.Supplier;

public class SupplierDemo2 {
    public static void main(String[] args) {

        Supplier<String> randomOtp = () -> {
            String otp = "";
            for(int i = 0; i < 6; i++)
                otp += (int)(Math.random() * 10);
            return otp;
        };

        System.out.println("Your OTP is : ---> " + randomOtp.get());
    }
}
