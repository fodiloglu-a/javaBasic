package StudentInfoSystem_PatikaDev;

public class Course {
    public Teacher teacher;//Teacher sınıfınıın parametresini tanımladım
                            //Buradaki parametre ile teacher sınıfının mettotlarına ulaşabilirim
                            //Aynı zaman da niteliği de teacher sınıfından tanımladık String değil mesela
    public String name;
    public String  code;
    public  String prefx;
    public  int note;



    Course(String name, String code,String prefx){
        this.name=name;
        this.code=code;
        this.prefx=prefx;
        int note=0;



    }

    public void printTeacherInfo(){
        //this.teacher.print();
    }

    public  void addTeacher(Teacher teacher){//
        if (teacher.branch.equals(this.prefx)){//teacher sınıfında kayıtlı olan teacherOne branch bakarak  course sayfasında bulunan ders prefcler uyuşuyormu bakar

            this.teacher=teacher;
            printTeacherInfo();///Teacher sınıfında bulunan print metodunu course sınıfında çalıştırdım

        }else {
            System.out.println("Öğretmen ya da ders bilgileri uyuşmuyor");
        }



    }
    public void printTeacher(){

    }
}
