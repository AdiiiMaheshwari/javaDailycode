package Java_8;

interface Star{
    public void sho(int x, int y);
}

public class LambdaExpression {
    public static void main(String[] args) {
        Star s1= (x,y)->{
            System.out.println(x*y);
        };
        s1.sho(19,2);
    }
}
