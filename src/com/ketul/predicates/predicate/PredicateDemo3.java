package com.ketul.predicates.predicate;

import java.util.Objects;
import java.util.function.Predicate;

class Employee {
    private String name;
    private String email;

    public Employee() {
    }

    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Employee employee = (Employee) o;
        return name.equals(employee.name) && email.equals(employee.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email);
    }
}

public class PredicateDemo3 {
    public static void main(String[] args) {
        Predicate<String> p1 = Predicate.isEqual("Ketul");
        System.out.println(p1.test("Ketul"));
        System.out.println(p1.test("ketul"));
        System.out.println(p1.test("durga"));
        System.out.println("------------------------------");

        Predicate<Employee> p2 = Predicate.isEqual(new Employee("Ketul", "pketul2212@gmail.com"));
        System.out.println(p2.test(new Employee("Ketul", "pketul2212@gmail.com")));
        System.out.println("------------------------------");

        Predicate p3 = Predicate.not(p1);
        System.out.println(p3.test("Ketul"));
        System.out.println(p3.test("ketul"));
        System.out.println(p3.test("durga"));

    }
}
