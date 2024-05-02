package Multithreading;

public class PeriorityThread extends Thread{
 public void run(){
     System.out.println("Child Thread");
     System.out.println(Thread.currentThread().getPriority());
 }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());
        PeriorityThread p= new PeriorityThread();
        p.setPriority(10);
        p.start();


    }
}
