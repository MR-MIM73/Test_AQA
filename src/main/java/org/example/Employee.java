package org.example;

public class Employee {
    String name;
    String post;
    String email;
    String telephone;
    double salary;
    int age;



    public Employee(String name, String post, String email, String telephone, double salary, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("ФИ: " + name);
        System.out.println("Должность: " + post);
        System.out.println("Электронная почта: " + email);
        System.out.println("Телефон: " + telephone);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
        System.out.println("                                       ");
    }

}