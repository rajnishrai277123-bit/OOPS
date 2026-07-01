package OOps;

public class car {
    String color;
    String brand;
    int speed;

    public static void main(String[] args) {
        car car1=new car();
        car1.speed=100;
        car1.run();
    }
   public void run() {
       System.out.println("car is running at"+speed);
   }
}
