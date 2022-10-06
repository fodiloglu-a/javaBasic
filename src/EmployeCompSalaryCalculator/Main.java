package EmployeCompSalaryCalculator;

public class Main {
    public static void main(String[] args) {
        Employe empOne=new Employe("Halil Ahmet",2000,42,2010);
        empOne.tax();
        empOne.bonus(empOne.workHours);
        empOne.riseYears(empOne.riseYears, empOne.salaray);
        empOne.print();

    }
}
