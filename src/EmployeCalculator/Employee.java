package EmployeCalculator;

public class Employee<e> {
    String firstname;
    String lastname;
    int salary; //Çalışanın maaş
    int workHours; //haftalık çalışma saati
    int hireYear; // İşe başlangıç yılı

    public Employee(String firstname, String lastname, int salary, int workHours, int hireYear) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() { // Maaşa uygulanan vergiyi hesaplayacaktır.
        if (this.salary >= 1000) {
            return 1000 * 0.3;
        }
        return 0.0;
    }

    public int bonus() {
        if (this.workHours >= 40) {
            int a = (this.workHours - 40) * 30;
            return a;
        }
        return 0;
    }

    public int raiseSalary() {
        if (2021 - this.hireYear >= 19) {
            return (int) (salary * 0.15);
        }
        if (2021 - this.hireYear <= 10) {
            return (int) (salary * 0.5);
        } else return (int) (salary * 0.15);
    }
    public String toString(employee employee){

        double total = this.salary -tax() + bonus() + raiseSalary();
        double tot = this.salary +bonus() - tax();
        System.out.println("Adı : "+this.firstname);
        System.out.println("Soyadı : "+this.lastname);
        System.out.println("Maaşı : "+ this.salary);
        System.out.println("Çalışma Saati : "+ this.workHours);
        System.out.println("Başlangıç Yılı : "+this.hireYear);
        System.out.println("Vergi : "+tax());
        System.out.println("Bonus : "+bonus());
        System.out.println("Maaş artışı : "+raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : "+tot);
        System.out.println("Toplam Maaş : "+total);

        return null;
    }

}