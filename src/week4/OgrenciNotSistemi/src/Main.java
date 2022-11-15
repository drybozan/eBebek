package week4.OgrenciNotSistemi.src;

public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Erdem Bacak","123","TRH");
        Teacher t2 = new Teacher("Talha Kabakuş","245","FZK");
        Teacher t3 = new Teacher("Fatih Aydın","852","MAT");

        Course tarih = new Course("Tarih","trh101","TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik","fzk102","FZK");
        fizik.addTeacher(t2);

        Course matematik = new Course("Matematik","mat103","MAT");
        matematik.addTeacher(t3);

        Student s1 = new Student("Ahmet Ak","4","100001",tarih,fizik,matematik);
        s1.addBulkExamlNote(80,20,80); //notlar
        s1.addBulkVerbalNote(70,55,90); //sözlü notlar
        s1.isPass();

        Student s2 = new Student("Simge Tutak","4","2000001",tarih,fizik,matematik);
        s2.addBulkExamlNote(95,80,60);
        s2.addBulkVerbalNote(60,70,90);
        s2.isPass();

        Student s3 = new Student("Ayse Kaya","4","300001",tarih,fizik,matematik);
        s3.addBulkVerbalNote(50,60,100);
        s3.addBulkExamlNote(40,40,60);
        s3.isPass();

    }
}