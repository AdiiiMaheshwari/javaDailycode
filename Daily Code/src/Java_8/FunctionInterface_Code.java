package Java_8;

interface work{
    void start(String msg);
    //void work(String msg);
   default void done(){
        System.out.println("just Gooo!");
    }

}

public class FunctionInterface_Code implements work{
    public  void  start(String msg){
        System.out.println("Function Interface");
    }
    public static void main(String[] args) {

        FunctionInterface_Code f= new FunctionInterface_Code();
        f.done();
        f.start("Function Interface");
    }


}
