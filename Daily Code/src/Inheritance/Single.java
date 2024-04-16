package Inheritance;
import java.util.Scanner;
class Animal{
    void eeat(){
        //Scanner sc=null;
        //String take=sc.nextLine();
        System.out.println("Ente");
    }
}
class Dog extends Animal {
    void walk(){
        //Scanner sc ;
        //String dooo=sc.nextLine();
        System.out.println("ENter doo");
    }
}

public class Single{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dog d= new Dog();
        d.walk();
        d.eeat();
    }
}
