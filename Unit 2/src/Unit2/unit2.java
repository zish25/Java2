package Unit2;

public class unit2 {
    public static void main(String[] args) {
        System.out.println("hello");
        Student student = new Student();
        Student student2 = new Student(44, "8930584","female","zin","zinath@gmail.com");
        student.RollNumber =1;
        student.Emailid = "zinath@gmail.com";
        student.Gender = "female";
        System.out.println(student.Emailid);
        System.out.println(student.Gender);
        System.out.println(student.PhoneNumber);
        System.out.println(student.Name);
    }
}


class Student{
    int RollNumber;
    String PhoneNumber;
    String Gender;
    String Name,Emailid;


    public Student(int rollNumber, String phoneNumber, String gender, String name, String emailid) {
        RollNumber = rollNumber;
        PhoneNumber = phoneNumber;
        Gender = gender;
        Name = name;
        Emailid = emailid;
    }

    public Student() {
        System.out.println("default Student Created");
    }
}
