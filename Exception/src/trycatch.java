public class trycatch {
    public static void main(String[] args) {
        System.out.println("before");

        try {
            int a = 10 / 0;
        } catch (Exception e) { //catch tbhi chlega jab koi error ayega
            System.out.println(e);
        }
        finally {
            System.out.println("finall");
        }
        System.out.println("after");
    }
}
