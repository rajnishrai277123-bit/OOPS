package OOps;

public class student {
    String name;
    int marks;
    int age;
   // double roll;
    student(String name, int age, int marks){
        System.out.println(name);
        this.name=name;
        this.marks=marks;
        this.age=age;
       // this.roll=roll;
    }

    public static void main(String[] args) {
        student s=new student("rajnish",22,700);
        System.out.println(s.name);
        System.out.println(s.marks);
        System.out.println(s.age);
    }
    void feature(student s){
        System.out.println("we are knowing"+s.name);
        System.out.println(s.marks);
    }
}
