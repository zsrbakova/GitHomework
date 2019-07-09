package com.company;

public class Main {

    public static void main(String[] args) {
        Employee e1=new Employee(1,"Ana","Stojanova",30000,"01.02.2019");
        Employee e2=new Employee(2,"Sanja","Ilieva",40000,"01.03.2019");
        Employee e3=new Employee(3,"Ivan","Atanasov",45000,"01.05.2019");

        System.out.println(e1.ID);
        System.out.println(e1.name);
        System.out.println(e1.surname);
        System.out.println(e1.salary);
        System.out.println(e1.StartDate);
	// write your code here
    }
}
