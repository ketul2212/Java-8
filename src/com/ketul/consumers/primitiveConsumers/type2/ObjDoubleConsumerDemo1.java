package com.ketul.consumers.primitiveConsumers.type2;

import java.util.Arrays;
import java.util.List;
import java.util.function.ObjDoubleConsumer;

class Employee {
    private String name;
    private String email;
    private double salary;

    public Employee() {
    }

    public Employee(String name, String email, double salary) {
        this.name = name;
        this.email = email;
        this.salary = salary;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class ObjDoubleConsumerDemo1 {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
                new Employee("Ketul", "ketul.patel@drcsystems.com", 20000),
                new Employee("Sunny", "sunny.patel@drcsystems.com", 30000.50),
                new Employee("Bunny", "bunny.patel@drcsystems.com", 10000.374)
        );

        ObjDoubleConsumer<Employee> incrementSalary = (employee, newSalary) -> employee.setSalary(newSalary + employee.getSalary());

        for(Employee employee : list)
            incrementSalary.accept(employee, 1000.56);

        for(Employee employee : list) {
            System.out.println(employee);
            System.out.println("---------------------------------------------------------------------");
        }
    }
}
