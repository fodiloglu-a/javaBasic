package EbebekJavaQaPraticium_Project;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------------------------");
        System.out.println("Welcome To Employee Company");
        System.out.println("---------------------------");
        Employee empOne=new Employee("AHMET",2000,60,2000);

        double tax= empOne.tax(empOne.salary);
        double bonus= empOne.bonus(empOne.workHours);
        double riseSalaray= empOne.raiseSalary(empOne.hireYear);
        double totalSalaray=tax+bonus+riseSalaray+ empOne.salary;

         //vergi,bonus, maaş artışı, vergi ve bonuslarla birlikte maaş, toplam maaş
        empOne.EmpPrint(tax,bonus,riseSalaray,totalSalaray) ;













     }
}
