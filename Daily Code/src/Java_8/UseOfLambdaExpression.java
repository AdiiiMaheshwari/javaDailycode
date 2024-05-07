package Java_8;

interface start{
    public  void run();
}
public class UseOfLambdaExpression {
    public static void main(String[] args) {
        int width=29;
        start d1= ()->{
            System.out.println("output "+width);
        };
        d1.run();
    }
}
