package Multithreading;

public class YeildThread  extends Thread{
    public void run(){
        for(int i=1;i<5;i++){
            System.out.println(Thread.currentThread().getName()+ "First Thread");

        }
    }
    public static void main(String[] args) {
        YeildThread th=new YeildThread();
        YeildThread th2= new YeildThread();
        th.start();
        th2.start();

        for(int i=1;i<5;i++){
            th.yield();
            System.out.println(Thread.currentThread().getName());

        }

    }
}
