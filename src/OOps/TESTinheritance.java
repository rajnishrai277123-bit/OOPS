package OOps;

public class TESTinheritance {
    public static void main(String[] args) {
        Animal animal=new Animal();
        animal.eat();
        animal.sound();
        animal.fly();
        Dog dog=new Dog();
        dog.eat();
        dog.sound();
        dog.fly();
        Animal a=new Dog(); //dynamic dispacher
        a.sound();
    }
}
