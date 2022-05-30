package com.ketul.suppliers.supplier;

import java.util.function.Supplier;

public class SupplierDemo4 {
    public static void main(String[] args) {
        Supplier<String> randomPassword = () -> {
          String password = "";
          String symbols = "aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ@#!_$@";


          for(int i = 0; i < 8; i++) {
              if(i % 2 == 0)
                  password += symbols.charAt((int)(Math.random() * 58));
              else
                  password += (int)(Math.random() * 10);
          }

          return password;
        };

        System.out.println("Your Password is " + randomPassword.get());
    }
}
