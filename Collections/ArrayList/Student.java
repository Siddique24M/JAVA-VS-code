import java.util.ArrayList;
import java.util.List;

public class Student {
    int id;
    String name;
    long mobno;

    public Student(int id, String name, long mobno){
        super();
        this.id = id;
        this.name = name;
        this.mobno = mobno;
    }
    // public String toString(){
    //     return "ID=" + id + " Name= " + name + " Mobile no=" + mobno;
    // }
    public static void main(String[] args) {
        Student s1 = new Student(101, "Sid", 7845);
        Student s3 = new Student(102, "Zaid", 7846);
        Student s2 = new Student(103, "Umar", 7847);

        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        System.out.println(list);
        for(Student s: list){
            System.out.println(s);
        }
    }
}
