package StudentInfoSystem_PatikaDev;

public class Teacher {
    public String name;
    public String mobNo;
    public  String branch;


    Teacher(String name,String mobNo,String branch){
        this.name=name;
        this.mobNo=mobNo;
        this.branch=branch;

    }
    public void print(){
        System.out.println("Adı:"+this.name);
        System.out.println("Bıranşı:"+this.branch);
        System.out.println("Tlf:"+this.mobNo);
    }
}
