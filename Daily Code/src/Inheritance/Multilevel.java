package Inheritance;
 class VegAnimal{
    void eat(){
        System.out.println("Eating food");
     }
 }
 class BigDog extends VegAnimal{
     void FoodVariety(){
         System.out.println("Dog eat Paneer");
     }
 }
 class BabyDog extends BigDog{
     static void takeSmallFood(){
         System.out.println("Milk");
     }
     Void dte(){
         System.out.println("Twomonth old");
         return null;
     }
 }
 public class Multilevel {
     public static void main(String[] args) {
         BabyDog b=new BabyDog();
         BabyDog.takeSmallFood();
         b.eat();
         b.FoodVariety();
         b.dte();
     }
}