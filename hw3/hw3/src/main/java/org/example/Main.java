package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static <ClassName> void main(String[] args) {
        Employee employee = new Employee("manager", "Nick", 1200);
        Supervisor s = new Supervisor("head", "Bob", 3500);

        Employee[] abc = new Employee [3];
        abc[0] = new Employee("manager", "Nick", 1200);
        abc[1] = new Employee("manager", "Chack", 1100);
        abc[2] = new Supervisor("head", "donald", 200);
        for (int i = 0; i < abc.length; i++) {
            System.out.println(abc[i].salary);

            abc[i].raiseTheSalary(500);
            System.out.println(abc[i].salary);
        }

    }
}

class Employee  {
    String jobtitle;
    String name;
    int salary;

    public Employee(String jobtitle,  String name, int salary){
        this.jobtitle = jobtitle;
        this.name = name;
        this.salary = salary;
    }
    public void  raiseTheSalary(int amount ){
        salary+=amount;
    };

//    public String getName() {
//        return name;
//    }

//    public String getJobtitle() {
//        return jobtitle;
//    }
//
//    public int getSalary() {
//        return salary;
//    }
//
//    public void setSalary(int salary) {
//        this.salary = salary;
//    }
}

class Supervisor extends Employee{

    public Supervisor(String jobtitle, String name, int salary) {
        super(jobtitle, name, salary);
    }

    @Override
    public  void raiseTheSalary(int amount ){
    };

}