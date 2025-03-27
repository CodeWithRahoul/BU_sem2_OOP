package org.example;

public class Main {
    public static void main(String[] args) {

        Employee firstEmployee = new SalariedEmployee("Mannan", "Khan", "124-11-1111",800.00);
        Employee secondEmployee = new CommissionEmployee("Saif", "ALi", "252-22-2221", 10000, 0.06);
        Employee thirdEmployee = new BasePlusCommissionEmployee("Ayaan", "Khan", "352-33-3533", 5000, 0.04, 300);
        Employee fourthEmployee = new HourlyEmployee("Niaz", "Raza", "144-44-4421", 16.75, 40);

        // polymorphism: calling toString() and earning() on Employee's reference
        System.out.println(firstEmployee);
        System.out.println(firstEmployee.earnings());
        System.out.println(secondEmployee);
        System.out.println(secondEmployee.earnings());
        System.out.println(thirdEmployee);

        // performing downcasting to access & raise base salary
        BasePlusCommissionEmployee currentEmployee = (BasePlusCommissionEmployee) thirdEmployee;

        double oldBaseSalary = currentEmployee.getBaseSalary();
        System.out.println("Old base salary: " + oldBaseSalary);

        currentEmployee.setBaseSalary(1.10 * oldBaseSalary);
        System.out.println("New base salary with 10% increase is: " + currentEmployee.getBaseSalary());

        System.out.println(thirdEmployee.earnings());
        System.out.println(fourthEmployee);
        System.out.println(fourthEmployee.earnings());


    }
}