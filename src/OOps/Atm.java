package OOps;

public class Atm {
   private String accountHolderName;
   private double balance;
    Atm(String name, double balance){
        this.accountHolderName=name;
        this.balance=balance;
    }

    public static void main(String[] args) {
        Atm atm=new Atm("raj",100000);
        atm.showBal();
    }
    void showBal(){
        System.out.println("your account bal="+balance);
    }
}
