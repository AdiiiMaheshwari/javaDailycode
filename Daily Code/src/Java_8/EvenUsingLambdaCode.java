package Java_8;

interface even{
    public void chek(int n);
}

public class EvenUsingLambdaCode {
    public static void main(String[] args) {

        even c=(n)->{
            System.out.println(n%2==0);
        };
        c.chek(4);
    }
}
