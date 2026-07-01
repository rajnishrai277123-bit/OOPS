package OOps;

public class course {
    String name;
    int duration;
 /*  course(){
        System.out.println("cons called....");
    }*/
    course(String name, int duration){
        System.out.println(name);
        this.name=name;//instace local
        this.duration=duration;
        System.out.println("para cons called..");
    }

    public static void main(String[] args) {
        System.out.println("before");
        course c=new course("java",4);
       // c.name="java full stack";
      //  c.learn(c);
        course c2=new course("Doops",5);
        System.out.println(c.name);
        System.out.println(c.duration);
        System.out.println(c2.name);
        System.out.println(c2.duration);
    }
    void learn(course c){
        System.out.println("we are learning"+c.name);
    }
}
