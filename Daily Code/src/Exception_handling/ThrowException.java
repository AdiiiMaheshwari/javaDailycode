package Exception_handling;

class YoungerAge extends RuntimeException{
    YoungerAge(String msg){
        super(msg);

    }
}
public class ThrowException {
    public static void main(String[] args) {
        int age=20;
        if(age<18){
            throw  new YoungerAge("You are not eligible for Vote");
        }
        else{
            System.out.println("You are eligibile for Vote");
        }
    }
}
