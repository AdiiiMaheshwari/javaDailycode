package Abstraction;

abstract class Vehicle{
    abstract void demo();
}
class Car extends Vehicle{
    void demo(){
        System.out.println("car start with powerButton");
    }
}


public class Scooter extends  Vehicle{
    void demo(){
        System.out.println("Scooty start with Self");
}
    public static void main(String[] args) {
        Scooter s =new Scooter();
        s.demo();
        Car c=new Car();
        c.demo();

    }
    }

