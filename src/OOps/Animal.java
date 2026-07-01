package OOps;

class species{
    void fly(){
        System.out.println("flying");
    }
}
public class Animal extends species{
    void eat(){
        System.out.println("animal is eating");
    }
    void sound(){
        System.out.println("making sound ahhhh ahhh");
    }

    @Override
    void fly() {
        System.out.println("not fly");
    }
}
class Dog extends Animal{
    @Override
    void sound() {
        System.out.println("barkk");
    }
}
