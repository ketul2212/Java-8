package com.ketul.consumers.primitiveConsumers.type2;

import java.util.Arrays;
import java.util.List;
import java.util.function.ObjIntConsumer;

class Company {
    private String name;
    private String email;
    private int noOfEmployee;

    public Company() {
    }

    public Company(String name, String email, int noOfEmployee) {
        this.name = name;
        this.email = email;
        this.noOfEmployee = noOfEmployee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNoOfEmployee() {
        return noOfEmployee;
    }

    public void setNoOfEmployee(int noOfEmployee) {
        this.noOfEmployee = noOfEmployee;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", noOfEmployee=" + noOfEmployee +
                '}';
    }
}

public class ObjIntConsumerDemo1 {
    public static void main(String[] args) {
        List<Company> list = Arrays.asList(
                new Company("Drc Systems", "drc@gmail.com", 100),
                new Company("TCS", "tcs@drcsystems.com", 200),
                new Company("Bunny", "bunny.patel@drcsystems.com", 300)
        );

        ObjIntConsumer<Company> addNewEmployee = (company, newEmployee) -> company.setNoOfEmployee(newEmployee + company.getNoOfEmployee());

        int newEmployee = 10;

        for(Company company : list) {
            addNewEmployee.accept(company, newEmployee);
            newEmployee += 10;
        }

        for(Company company : list) {
            System.out.println(company);
            System.out.println("---------------------------------------------------------------------");
        }
    }
}
