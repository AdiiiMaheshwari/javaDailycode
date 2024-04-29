package Multithreading;

class MyThread1 extends Thread{
    public void run(){
        System.out.println("Start thread");
    }
}
class MyThread2 extends Thread{
    public void run(){
        System.out.println("Successfully Run the thread");
    }
}
public class MainThread {
    public static void main(String[] args) {
        MyThread1 t1=new MyThread1();
        t1.start();
        MyThread2 t2=new MyThread2();
        t2.start();

    }
}
