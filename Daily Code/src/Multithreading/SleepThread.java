package Multithreading;

public class SleepThread extends Thread {

    public void run(){
        for(int i=1;i<5;i++){
            try{
                Thread.sleep(10000);
            }catch (Exception e){

            }
        }
    }
    public static void main(String[] args) {

    }
}
