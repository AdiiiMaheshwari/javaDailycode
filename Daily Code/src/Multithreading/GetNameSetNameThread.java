package Multithreading;

public class GetNameSetNameThread  extends Thread{
    public void run(){
        System.out.println(currentThread().currentThread().getName());
        System.out.println("Thread Task1");
    }
    public static void main(String[] args) {

        GetNameSetNameThread t1= new GetNameSetNameThread();
        t1.start();
        System.out.println(Thread.currentThread().getName());
    }
}
