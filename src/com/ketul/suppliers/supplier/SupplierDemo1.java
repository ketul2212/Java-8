package com.ketul.suppliers.supplier;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierDemo1 {
    public static void main(String[] args) {
        Supplier<LocalDateTime> s = () -> LocalDateTime.now();
        System.out.println(s.get());
    }
}
