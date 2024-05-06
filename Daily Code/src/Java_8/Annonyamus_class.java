package Java_8;

abstract class Student{
    void start(){

    }
}
public class Annonyamus_class {
    public static void main(String[] args) {
        Student s= new Student() {
            @Override
            void start() {
                System.out.println("djbhss");
            }
        };
        s.start();
    }
}
