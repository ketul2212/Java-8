package com.ketul.suppliers.primitiveSuppliers;

import java.time.LocalDate;
import java.util.function.BooleanSupplier;

public class BooleanSupplierDemo1 {
    public static void main(String[] args) {
        BooleanSupplier checkCurrentYearLeapOrNot = () -> LocalDate.now().isLeapYear();
        if(checkCurrentYearLeapOrNot.getAsBoolean())
            System.out.println("Current Year " + LocalDate.now().getYear() + " is leap year");
        else
            System.out.println("Current Year " + LocalDate.now().getYear() + " is not leap year");
    }
}
