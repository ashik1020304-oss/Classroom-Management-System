
public class NewClass {


    public static void main(String[] args) 
    {
        
        Student student1 = new Student();
        student1.Read();
        student1.Displayinfo();
        student1.name = "Ashik";
        student1.id = 700;
        student1.section = "69_I";
        student1.address = "Dhaka";
        student1.Displayinfo();

     }
    }

class Student {

    int id;
    String name;
    String section;
    String address ;

    void Read() 
    {
        System.out.println("Student is reading");
    }

    void Displayinfo() {
        System.out.println("Name = " + name);
        System.out.println("ID = " + id);
        System.out.println("Section = " + section);
        System.out.println("Address = " + address);
    }

}