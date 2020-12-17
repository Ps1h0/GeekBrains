package com.company;

public class Employee {
    String surname;
    String name;
    String patronymic;
    String position;
    String email;
    String phoneNumber;
    int salary;
    int age;

    public Employee(String surname, String name, String patronymic, String position,
                    String email, String phoneNumber, int salary, int age){
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void getInformation(){
        System.out.println("=======================");
        System.out.println("Surname: " + surname);
        System.out.println("Name: " + name);
        System.out.println("Patronymic: " + patronymic);
        System.out.println("Position: " + position);
        System.out.println("E-mail: " + email);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Salary : " + salary);
        System.out.println("Age: " + age);
        System.out.println("=======================");
    }
}
