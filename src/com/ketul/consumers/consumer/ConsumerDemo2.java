package com.ketul.consumers.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student {
    private String name;
    private double marks;
    private String grade;

    public Student() {
    }

    public Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                ", grade='" + grade + '\'' +
                '}';
    }
}

public class ConsumerDemo2 {

    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("Ketul Patel", 90),
                new Student("Sunny Patel", 80),
                new Student("Punny Patel", 40),
                new Student("chinny Patel", 20)
        );

        Predicate<Student> checkMarks = student -> student.getMarks() > 60;
        Function<Student, String> calculateGrade = student -> {
            if(student.getMarks() > 80)
                return "A";
            else if(student.getMarks() > 70)
                return "B";
            else if(student.getMarks() > 50)
                return "C";
            else if(student.getMarks() > 30)
                return "D";
            else
                return  "F";
        };
        Consumer<Student> filterStudentBasedOnMarks = student -> {
            student.setGrade(calculateGrade.apply(student));
            System.out.println(student);
            System.out.println("----------------------------------------------------");
        };

        for(Student student : list) {
            if(checkMarks.test(student))
                filterStudentBasedOnMarks.accept(student);
        }

    }
}
