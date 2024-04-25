package Exception_handling;

public class First_exception {
    public static void main(String[] args) {
        //int a=100;
        try{
            int a=50/0;
        }catch (ArithmeticException e){
            System.out.println("Exception throw");
        }
        System.out.println("Done");

    }
}
