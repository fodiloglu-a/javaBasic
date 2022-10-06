package StudentInfoSystem_PatikaDev;

public class Main {
    public static void main(String[] args) {
        Course tarih =new Course("Tarih","101","TRH");

        Teacher teacherOne=new Teacher("Mahmut Hoca","0505","TRH");
        tarih.addTeacher(teacherOne);

        Course fizik =new Course("Fizik","102","FZK");
        Teacher teacherTwo=new Teacher("Graham Bell","000","FZK");
        fizik.addTeacher(teacherTwo);

        Course kimya=new Course("Kimya","103","KMY");
        Teacher teacherThree=new Teacher("Abbaas Ustaoğlu","222","KMY");
        kimya.addTeacher(teacherThree);

        Student stuOne=new Student("İnek Şaban","123","bes",tarih,fizik,kimya );
        stuOne.addBulkExamNote(100,52,80);
        stuOne.isPass();
        Student stuTwo=new Student("Düdük Necmi","124","beş",tarih,fizik,kimya);
        stuTwo.addBulkExamNote(52,52,40);
        stuTwo.isPass();


        //**NOTE
        //Course tarih =new Course("Tarih","TRH",teacherOne); //buradan tanımlanan teacherOne
        // Teacher sınıfında tanımlanan nesneye karşılık gelmektedir.
        //Yukarıdaki notta bahsedile özellik alttaki gibi de tanımlanabilir.







    }
}
