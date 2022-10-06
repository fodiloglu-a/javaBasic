package EmployeCompSalaryCalculator;

public class Employe {
    public String name;
    public int salaray;
    public int workHours;
    public int startYears;
    public int riseYears;
    int bonus;
    double tax;

    Employe(String name, int salaray, int workhours, int startYears){
        this.name=name;
        this.salaray=salaray;
        this.workHours= workhours;
        this.startYears=startYears;


    }
    public void tax(){

        if(salaray>1000){
            this.tax=(this.salaray*3.0)/100.0;

        }
    }
    public void bonus(int workHours){

        if (workHours>40){
            int bonus=(workHours-40)*30;
            this.bonus=bonus;
        }
            }


   public  void riseYears(int startYears, int salaray){

        if ( (2022-startYears)<10 ){
            int bonus=(salaray*5)/100;
            this.riseYears=bonus;
        }
        if (9<(2022-startYears)&&(2022-startYears)<20){
            int bonus=(salaray*10)/100;
            this.riseYears=bonus;
        }
        if (19<(2022-startYears) ){
            int bonus=(salaray*5)/100;
            this.riseYears=bonus;
        }
   }

   public  void print(){
       System.out.println("Adı\t:"+this.name);
       System.out.println("Maaşı\t:"+this.salaray);
       System.out.println("Çalışma Saati\t:"+this.workHours);
       System.out.println("Başlangıç yılı\t:"+this.startYears);
       System.out.println("Vergi\t:"+this.tax);
       System.out.println("Bonus\t:"+this.bonus);
       int artis=(int) (this.bonus+this.riseYears);
       System.out.println("Maaş artışı\t:"+artis );
       int toplamMaas= (int) (this.salaray+this.bonus+this.riseYears-this.tax);
       System.out.println("Toplam Maas\t:"+ toplamMaas);





   }

}
