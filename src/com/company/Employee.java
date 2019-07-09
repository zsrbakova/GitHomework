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

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    public String getName()
    {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

