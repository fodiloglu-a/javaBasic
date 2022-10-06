package StudentInfoSystem_PatikaDev;



public class Student {
    public  String name;
    public String studentNo;
    public String clas;
    public Course course1;
    public Course course2;
    public Course course3;
    public double average;
    public boolean isPass;

    Student(String name,String studentNo,String clas,Course course1,Course course2,Course course3){
        this.name=name;
        this.studentNo=studentNo;
        this.clas=clas;
        this.course1=course1;
        this.course2=course2;
        this.course3=course3;
        this.average=0.0;
        this.isPass=false;

    }
    public void addBulkExamNote(int note1,int note2,int note3){
        if (note1>=0&&note1<=100){
            this.course1.note=note1;
        }
        if (note3>=0&&note3<=100){
            this.course2.note=note2;
        }if (note3>=0&&note1<=100){
            this.course3.note=note3;
        }




        }
    public void isPass(){
        this.average=(this.course1.note+this.course1.note+this.course3.note)/3.0;
        System.out.println("-------------------------------------");

        if (this.average>55){

            System.out.println("SINIFI GEÇTİNİZ");

        }else {
            System.out.println("SINIFTA KALDINIZ!");
        }
        printNote();


    }
    public int calcAverage(){
        return 1;
    }
    public  void printNote(){
         System.out.println(this.course1.name+":"+this.course1.note);
        System.out.println(this.course2.name+":"+this.course2.note);
        System.out.println(this.course3.name+":"+this.course3.note);
        System.out.println("Ortalma"+this.average);

    }

}
