package EbebekJavaQaPraticium_Project;

public class Employee{


    public String name;
    public int  salary;
    public int workHours;
    public int hireYear;



    public Employee(String name,int salary,int workHours,int hireYear){
        this.name=name;
        this.salary= salary;
        this.workHours=workHours;
        this.hireYear=hireYear;


    }
    public int tax(int salary){
        if (salary<1000){
            return 0;
        }
        else {
             int tax=(salary/3)*100;
            return  tax;
        }

    }
    public int bonus(int workHours){
        int bonus=(workHours-40)*30;
        return   bonus;
    }
    public int raiseSalary(int hireYear){
        int raiseSalary=2021-hireYear;
       if ( raiseSalary<10){
            raiseSalary=(this.salary/5)*100;
           return  raiseSalary;
       } else if ((9< raiseSalary &&  raiseSalary<20)) {
            raiseSalary=( this.salary/10)*100;
           return  raiseSalary;

       }else{
           return 0;
       }

    }


    public  void EmpPrint(double vergi,double bonus,double outSalary,double totalMaas){
        System.out.println("isim\t:"+this.name);
        System.out.println("Maas\t:"+this.salary);
        System.out.println("Çalışma Saati\t:"+this.workHours);
        System.out.println("Çalışma Yılı\t:"+this.hireYear);
        System.out.println("Vergi\t:"+vergi );
        System.out.println("Bonus\t:"+ bonus );
        System.out.println("Maas Artışı\t:"+outSalary );

        System.out.println("Maas Harici artış\t:"+totalMaas);
    }








}
