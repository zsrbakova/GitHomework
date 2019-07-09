package com.company;

public class Employee {
    int ID;
    String name;
    String surname;
    int salary;
    String StartDate;

    public Employee()
    {

    }
    public Employee(int ID,String name,String surname,int salary,String StartDate)
    {
        this.ID=ID;
        this.name=name;
        this.surname=surname;
        this.salary=salary;
        this.StartDate=StartDate;
    }
    public String getSurname()
    {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}

